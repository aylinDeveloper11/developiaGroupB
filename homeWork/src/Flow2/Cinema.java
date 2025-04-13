package Flow2;

public class Cinema {
	public static void main(String[] args) {
       
        Thread buyTicket = new Thread(() -> {
            System.out.println("Покупаю билет");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            	// TODO Auto-generated catch block
            }
            System.out.println("Билет куплен!");
        });

      
        Thread buyPopcorn = new Thread(() -> {
            System.out.println("Покупаю попкорн");
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
            	// TODO Auto-generated catch block
            }
            System.out.println("Попкорн куплен!");
        });

        buyTicket.start();
        buyPopcorn.start();

        Thread watchMovie = new Thread(() -> {
            try {
				buyTicket.join();
				buyPopcorn.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
            
            System.out.println("Смотрю кино!🎬");
        });

        watchMovie.start();
    }
}
