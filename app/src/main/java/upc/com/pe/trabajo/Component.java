package upc.com.pe.trabajo;

/**
 * Created by william on 21/05/15.
 */
public class Component {
    private String ramMemory[], processor[], hardDisk[], networkCard[], motherboard[], videoAdapter[], cdDrives[], soundDevice[], keyboard[], mouse[], printer[], monitor[];

    Component(){
        ramMemory = new String[3];
        processor = new String[3];
        hardDisk = new String[3];
        networkCard = new String[3];
        motherboard = new String[3];
        videoAdapter = new String[3];
        cdDrives = new String[3];
        soundDevice = new String[3];
        keyboard = new String[3];
        mouse = new String[3];
        printer = new String[3];
        monitor = new String[3];
    }
    public void getIn(){
        for(int i=0; i<3; i++){
            ramMemory[i]="ram memory"+(i+1);
            processor[i]="processor"+(i+1);
            hardDisk[i]="hard disk"+(i+1);
            networkCard[i]="networkCard"+(i+1);
            motherboard[i]="motherboard"+(i+1);
            videoAdapter[i]="videoAdapter"+(i+1);
            cdDrives[i]="cdDrives"+(i+1);
            soundDevice[i]="soundDevice"+(i+1);
            keyboard[i]="keyboard"+(i+1);
            mouse[i]="mouse"+(i+1);
            printer[i]="printer"+(i+1);
            monitor[i]="monitor"+(i+1);
        }
    }
    public String getRamMemory(int pos){
        if(pos>0 && pos<(ramMemory.length))
            return ramMemory[pos];
        else
            return "";
    }
    public String getProcessor(int pos){
        if(pos>0 && pos<(processor.length))
            return processor[pos];
        else
            return "";
    }
    public String getHardDisk(int pos){
        if(pos>0 && pos<(hardDisk.length))
            return hardDisk[pos];
        else
            return "";
    }public String getNetworkCard(int pos){
        if(pos>0 && pos<(networkCard.length))
            return networkCard[pos];
        else
            return "";
    }

    public String getMotherboard(int pos) {
        if(pos>0 && pos<(networkCard.length))
            return networkCard[pos];
        else
            return "";
    }

    public String getVideoAdapter(int pos) {
        if(pos>0 && pos<(videoAdapter.length))
            return videoAdapter[pos];
        else
            return "";
    }

    public String getCdDrives(int pos) {
        if(pos>0 && pos<(cdDrives.length))
            return cdDrives[pos];
        else
            return "";
    }

    public String getSoundDevice(int pos) {
        if(pos>0 && pos<(soundDevice.length))
            return soundDevice[pos];
        else
            return "";
    }

    public String getKeyboard(int pos) {
        if(pos>0 && pos<(keyboard.length))
            return keyboard[pos];
        else
            return "";
    }

    public String getMouse(int pos) {
        if(pos>0 && pos<(mouse.length))
            return mouse[pos];
        else
            return "";
    }

    public String getPrinter(int pos) {
        if(pos>0 && pos<(printer.length))
            return printer[pos];
        else
            return "";
    }

    public String getMonitor(int pos) {
        if(pos>0 && pos<(monitor.length))
            return monitor[pos];
        else
            return "";
    }
}
