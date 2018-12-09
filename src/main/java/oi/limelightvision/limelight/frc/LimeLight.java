package oi.limelightvision.limelight.frc;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import oi.limelightvision.limelight.frc.ControlMode.*;

/**
*   Lime Light Class was started by Corey Applegate of Team 3244
*   Granite City Gearheads. We Hope you Enjoy the Lime Light
*   Camera. 
*/
public class LimeLight {


// Put methods for controlling this subsystem
// here. Call these from Commands.

    private NetworkTable m_table;
    private String m_tableName;
    /**
     * Using the Default Lime Light NT table
     */
    public LimeLight() {
        m_tableName = "limelight";
        m_table = NetworkTableInstance.getDefault().getTable(m_tableName);
    }

    /**
     * If you changed the name of your Lime Light tell Me the New Name
     */
    public LimeLight(String tableName) {
        m_tableName = tableName;
        m_table = NetworkTableInstance.getDefault().getTable(m_tableName);
    }

    /**
     * Send an instance of the NetworkTabe
     */
    public LimeLight(NetworkTable table) {
        m_table = table;
        //ToDo
        //m_tableName = get the name of the NT key.
    }
    
    public void LimeLightInit() {
        testAllTab();
    }
    private void testAllTab(){
        ShuffleboardTab LimeLightTab = Shuffleboard.getTab(m_tableName);
        // To Do
        // populate tab with all the data
       
    }

    /**
     * tv   Whether the limelight has any valid targets (0 or 1)
     * @return
     */
    public boolean getIsTargetFound() {
        NetworkTableEntry tv = m_table.getEntry("tv");
        double v = tv.getDouble(0);
        if (v == 0.0f){
            return false;
        }else {
            return true;
        }
    }
    /**
     * tx Horizontal Offset From Crosshair To Target (-27 degrees to 27 degrees)
     * @return
     */
    public double getdegRotationToTarget() {
        NetworkTableEntry tx = m_table.getEntry("tx");
        double x = tx.getDouble(0.0);
        return x;
    }
    /**
     * ty Vertical Offset From Crosshair To Target (-20.5 degrees to 20.5 degrees)
     * @return 
     */
    public double getdegVerticalToTarget() {
        NetworkTableEntry ty = m_table.getEntry("ty");
        double y = ty.getDouble(0.0);
        return y;
    }
    /**
     * ta Target Area (0% of image to 100% of image)
     * @return
     */
    public double getTargetArea() {
        NetworkTableEntry ta = m_table.getEntry("ta");
        double a = ta.getDouble(0.0);
        return a;
    }
    /**
     * ts Skew or rotation (-90 degrees to 0 degrees)
     * @return
     */
    public double getSkew_Rotation() {
        NetworkTableEntry ts = m_table.getEntry("ts");
        double s = ts.getDouble(0.0);
        return s;
    }
    /**
     * tl The pipeline’s latency contribution (ms) Add at least 11ms for image capture latency.
     * @return
     */
    public double getPipelineLatency() {
        NetworkTableEntry tl = m_table.getEntry("tl");
        double l = tl.getDouble(0.0);
        return l;
    }

    //Setters
    
    /**
     * LedMode  Sets limelight’s LED state
     * 
     *  kon
     *  koff
     *  kblink
     * @param ledMode
     */
     public void setLEDMode(LedMode ledMode) {
        m_table.getEntry("ledMode").setValue(ledMode.getValue());
    }

    /**
     * Returns current LED mode of the Lime Light
     * @return LedMode
     */
    public LedMode getLEDMode() {
        NetworkTableEntry ledMode = m_table.getEntry("ledMode");
        double led = ledMode.getDouble(0.0);
        LedMode mode = LedMode.getByValue(led);
        return mode;
    }
    
    /**
     * camMode  Sets limelight’s operation mode
     * 
     *  kvision
     *  kdriver (Increases exposure, disables vision processing)
     * @param camMode
     */
    
    public void setCamMode(CamMode camMode) {
        m_table.getEntry("camMode").setValue(camMode.getValue());
    }

    /**
     * Returns current Cam mode of the Lime Light
     * @return CamMode
     */
    public CamMode getCamMode() {
        NetworkTableEntry camMode = m_table.getEntry("camMode");
        double cam = camMode.getDouble(0.0);
        CamMode mode = CamMode.getByValue(cam);
        return mode;
    }

    /**
     * pipeline Sets limelight’s current pipeline
     * 
     * 0 . 9	Select pipeline 0.9
     * 
     * @param pipeline
     */
    public void setPipeline(Double pipeline) {
        if(pipeline<0){
            pipeline = 0.0;
            throw new IllegalArgumentException("Pipeline can not be less than zero");
        }else if(pipeline>9){
            pipeline = 9.0;
            throw new IllegalArgumentException("Pipeline can not be greater than nine");
        }
        m_table.getEntry("pipeline").setValue(pipeline);
    }

    /**
     * Returns current Pipeling of the Lime Light
     * @return Pipelinge
     */
    public double getPipeline(){
        NetworkTableEntry pipeline = m_table.getEntry("pipeline");
        double pipe = pipeline.getDouble(0.0);
        return pipe;
    }

    /**
     * stream   Sets limelight’s streaming mode
     * 
     * kStandard - Side-by-side streams if a webcam is attached to Limelight
     * kPiPMain - The secondary camera stream is placed in the lower-right corner of the primary camera stream
     * kPiPSecondary - The primary camera stream is placed in the lower-right corner of the secondary camera stream
     * 
     * @param stream
     */ 
    public void setStream(Stream stream) {
        m_table.getEntry("stream").setValue(stream.getValue());
    }

    public Stream getStream() {
        NetworkTableEntry stream = m_table.getEntry("stream");
        double st = stream.getDouble(0.0);
        Stream mode = Stream.getByValue(st);
        return mode;
    }


    /**
     * snapshot Allows users to take snapshots during a match
     * 
     * kon - Stop taking snapshots
     * koff - Take two snapshots per second
     * @param snapshot
     */
    public void setSnapshot(Snapshot snapshot) {
        m_table.getEntry("snapshot").setValue(snapshot.getValue());
    }

    public Snapshot getSnapshot() {
        NetworkTableEntry snapshot = m_table.getEntry("snapshot");
        double st = snapshot.getDouble(0.0);
        Snapshot mode = Snapshot.getByValue(st);        
        return mode;
    }

    // *************** Advanced Usage with Raw Contours *********************   

    /**
     * Limelight posts three raw contours to NetworkTables that are not influenced by your grouping mode. 
     * That is, they are filtered with your pipeline parameters, but never grouped. X and Y are returned 
     * in normalized screen space (-1 to 1) rather than degrees.	 * 
     */

    public double Advanced_RotationToTarget(int raw) {
        NetworkTableEntry txRaw = m_table.getEntry("tx" + Integer.toString(raw));
        double x = txRaw.getDouble(0.0);
        return x;
    }

    public double Advanced_degVerticalToTarget(int raw) {
        NetworkTableEntry tyRaw = m_table.getEntry("ty" + Integer.toString(raw));
        double y = tyRaw.getDouble(0.0);
        return y;
    }

    public double Advanced_TargetArea(int raw) {
        NetworkTableEntry taRaw = m_table.getEntry("ta" + Integer.toString(raw));
        double a = taRaw.getDouble(0.0);
        return a;
    }
    
    public double Advanced_Skew_Rotation(int raw) {
        NetworkTableEntry tsRaw = m_table.getEntry("ts" + Integer.toString(raw));
        double s = tsRaw.getDouble(0.0);
        return s;
    }

    //Raw Crosshairs:
    //If you are using raw targeting data, you can still utilize your calibrated crosshairs:
    
    public double[] Advanced_RawCrosshair(int raw){
        double[] crosshars = new double[2];
        crosshars[0] = Advanced_RawCrosshair_X(raw);
        crosshars[1] = Advanced_RawCrosshair_Y(raw);
        return crosshars;
    }
    public double Advanced_RawCrosshair_X(int raw) {
        NetworkTableEntry cxRaw = m_table.getEntry("cx" + Integer.toString(raw));
        double x = cxRaw.getDouble(0.0);
        return x;
    }

    public double Advanced_RawCrosshair_Y(int raw) {
        NetworkTableEntry cyRaw = m_table.getEntry("cy" + Integer.toString(raw));
        double y = cyRaw.getDouble(0.0);
        return y;
    }
}
