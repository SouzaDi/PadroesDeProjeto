package iterator;

public class MostraVideo {

	public static void main(String[] args) {
		VideoItem [] videoItens = new VideoItem[4];
		
		videoItens[0] = new VideoItem("Minions 2", 10.5);
		videoItens[1] = new VideoItem("Panico 5", 12.5);
		videoItens[2] = new VideoItem("Agente 007", 11.5);
		videoItens[3] = new VideoItem("Venom", 12.0);
		
		Iterator videoIterator = new VideoIterator(videoItens);
		
		while (videoIterator.hasNext()) {
			VideoItem videoItem = (VideoItem)videoIterator.next();
			System.out.println(videoItem.nome+" = R$ "+videoItem.preco);
		}
	}

}
