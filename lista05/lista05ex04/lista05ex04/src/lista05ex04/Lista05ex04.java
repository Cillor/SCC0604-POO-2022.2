package lista05ex04;

public class Lista05ex04 {

    public static void main(String[] args) {
        DoStackOverflow(1);
        // TODO code application logic here
    }
    
    public static void DoStackOverflow(int i) {
        DoStackOverflow(i);
    }
    
}
/* Explicação da estratégia aplicada para causar o erro java.lang.StackOverflowError:


Parâmetros e variáveis locais são alocados na stack. A stack tem uma quantidade fixa de memória, caso essa memória se esgote, um erro de StackOverflow acontecerá. No exercício foi pedido para que criássemos um código que propositalmente causasse o erro de stackOverflow. 
	Então foi criado um código muito simples com um método que chama a si mesmo (recursão) infinitamente sem nenhum critério de parada e que manda um parâmetro (i) para si. Esse parâmetro fica salvo na stack a cada chamada, e como as chamadas ocorrem infinitamente, a stack se esgota, causando o erro java.lang.Stack.OverflowError.
Log do erro:

Exception in thread "main" java.lang.StackOverflowError
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	at lista05ex04.Lista05ex04.DoStackOverflow(Lista05ex04.java:11)
	/home/cillor/.cache/netbeans/15/executor-snippets/run.xml:111: The following error occurred while executing this line:
/home/cillor/.cache/netbeans/15/executor-snippets/run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

*/
