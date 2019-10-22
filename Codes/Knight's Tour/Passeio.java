import javafx.scene.layout.Border;

public class Passeio{
    private int BOARD_SIZE;
    private int [][] visitou;
    private int[] xMov = {2,1,-1,-2,-2,-1,1,2};
    private int[] yMov = {1,2,2,1,-1,-2,-2,-1};
    
    public Passeio(int BordaTam){
        this.BOARD_SIZE = BordaTam;
        this.visitou = new int [BOARD_SIZE][BOARD_SIZE];
        this.iniciaborda();    
    }
    private void iniciaborda(){
        for(int i = 0; i<BOARD_SIZE; i++)
            for(int j=0;j<BOARD_SIZE; j++)
                this.visitou[i][j] = Integer.MIN_VALUE;
    }
    public void printSolucao(){
        for(int i=0;i<BOARD_SIZE; i++){
            for(int j=0;j<BOARD_SIZE;j++){
                System.out.printf("%d  ",visitou[i][j]);
            }
            System.out.println();
        }
    }
    public void solucao(){
        visitou[0][0] = 0;
        // inicia o passeio pelo topo esquerdo do tabuleiro(0,0)
        if(ResolveProblema(1,0,0)){
            printSolucao();
        }else{
            System.out.println("Nenhuma solução encontrada.");
        }
    }
        public boolean ResolveProblema(int movcount,int x,int y){
            if(movcount == BOARD_SIZE * BOARD_SIZE){
                return true;
            }
            for(int i = 0; i <xMov.length;i++){
                int nextX = x + xMov [i];
                int nextY = y + yMov [i];

                //checa se a posição é valida e não foi visitada.
                if(isValido(nextX, nextY) && visitou[nextX][nextY] == Integer.MIN_VALUE){
                    visitou[nextX][nextY] = movcount;
                    if(ResolveProblema(movcount +1, nextX, nextY)){
                        return true;
                    }
                    // VOLTE ATRÁS
                    visitou[nextX][nextY] = Integer.MIN_VALUE;
                }
            }
            return false;
        }
        public boolean isValido(int x, int y){
            if(x < 0 || x >= BOARD_SIZE || y < 0 || y >= BOARD_SIZE){
                return false;
            }else{
                return true;
            }
        }
    }

