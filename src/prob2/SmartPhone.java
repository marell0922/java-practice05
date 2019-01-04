package prob2;

/*
 * 
< 실행 결과 >

다운로드해서 음악재생
통화기능시작
앱실행

 * */
public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if ( function.equals("앱") ) {
			startApp();
			return;
		}
		
		super.execute( function );
	}
	
	public void startApp() {
		System.out.println("앱 실행");
	}
	
	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
}
