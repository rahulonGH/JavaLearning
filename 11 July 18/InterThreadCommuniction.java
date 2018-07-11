package git.Learning;
class Chat {
	   boolean chek = false;
	   public synchronized void Question(String cnv) {
	      if (chek) {
	         try {
	            wait();
	         } catch (InterruptedException ie) {
	            ie.printStackTrace();
	         }
	      }
	      System.out.println(cnv);
	      chek = true;
	      notify();
	   }

	   public synchronized void Answer(String cnv) {
	      if (!chek) {
	         try {
	            wait();
	         } catch (InterruptedException ie) {
	            ie.printStackTrace();
	         }
	      }

	      System.out.println(cnv);
	      chek = false;
	      notify();
	   }
	}

	class Person1 implements Runnable {
	   Chat ch1;
	   String[] conversation1 = { "Hi", "How are you ?", "I am also doing fine!" };

	   public Person1(Chat c1) {
	      this.ch1 = c1;
	      new Thread(this, "Question").start();
	   }

	   public void run() {
	      for (int x = 0; x < conversation1.length; x++) {
	         ch1.Question(conversation1[x]);
	      }
	   }
	}

	class Person2 implements Runnable {
	   Chat ch2;
	   String[] conversation2 = { "Hi", "I am good, what about you?", "Great!" };

	   public Person2(Chat c2) {
	      this.ch2 = c2;
	      new Thread(this, "Answer").start();
	   }

	   public void run() {
	      for (int x = 0; x < conversation2.length; x++) {
	         ch2.Answer(conversation2[x]);
	      }
	   }
	}

public class InterThreadCommuniction {

	public static void main(String[] args) {
		Chat chat = new Chat();
	      new Person1(chat);
	      new Person2(chat);
	}

}
