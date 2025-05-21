public class RadioPlayer implements Player {
    public boolean onOff;
    public double[] stationList;
    public int volume;
    public double station;
    public RadioPlayer(double[] stationList){
        this.stationList=stationList;
        this.onOff=false;
        this.volume=0;
        this.station=0;
    }
    @Override
    public void start(){
        if(this.onOff==false){
            this.onOff=true;
        }
        this.station=this.stationList[0];
    }
    @Override
    public void stop(){
        if(this.onOff==true){
            this.onOff=false;
        }
        this.station=0;
    }
    @Override
    public void volumeUp(){
        this.volume+=2;
    }
    @Override
    public void volumeDown(){
        this.volume-=2;
    }
    public int getVolume(){
        return this.volume;
    }
    public void next(){
        int index=1;
        for(int i=0;i<this.stationList.length;i++){
            if(this.station==this.stationList[i]){
                index=i;
            }
        }
        this.station=this.stationList[index+1];
    }
    public void previous(){
        int index=-1;
        for(int i=0;i<this.stationList.length;i++){
            if(this.station==this.stationList[i]){
                index=i;
            }
        }
        this.station=this.stationList[index-1];
    }
    public double getStation(){
        return this.station;
    }
    public boolean getOnOff(){
        return this.onOff;
    }
}
