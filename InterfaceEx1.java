package oopsTasks;
interface playable {
	String play();
}
class Video implements playable{
	String V;
	public Video() {
		this.V="Playing Video";
	}
	public String play() {
		return this.V;
	}
}
class Audio implements playable{
	String a;
	public Audio() {
	   this.a="Playing Audio";
	}
	public String play() {
		return this.a;
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		playable video=new Video();
		playable audio=new Audio();
		System.out.println(video.play());
		System.out.println(audio.play());
	}

}
