public class MusicPlayer implements Player{
    public boolean onOff;
    public String[] musicList;
    public String currentSong;
    public int volume;

    public MusicPlayer(String[] musicList){
        this.musicList=musicList;
        this.volume=0;
        this.onOff=false;
        this.currentSong="";
    }
    @Override
    public void start(){
        if(this.onOff==false){
            this.onOff=true;
        }
        this.currentSong=this.musicList[0];
    }
    @Override
    public void stop(){
        if(this.onOff==true){
            this.onOff=false;
        }
        this.currentSong="";
    }
    public boolean getOnOff(){
        return this.onOff;
    }
    @Override
    public void volumeUp(){
        this.volume+=1;
    }
    @Override
    public void volumeDown(){
        this.volume-=1;
    }
    public int getVolume(){
        return this.volume;
    }
    public void next(){
        int index=-1;
        for(int i=0;i<this.musicList.length;i++){
             if(this.currentSong==this.musicList[i]){
                index=i;
             }
        }
       
        this.currentSong=this.musicList[index+1];
    }

    public void previous(){
         int index=-1;
        for(int i=0;i<this.musicList.length;i++){
             if(this.currentSong==this.musicList[i]){
                index=i;
             }
        }
       
        this.currentSong=this.musicList[index-1];
    }
    public String getCurrentSong(){
        return this.currentSong;
    }
}
