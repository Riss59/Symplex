
public class Sympleks {
    private int rows, cols; // wiersze kolumny
    private float[][] table; // tabela symplex
    private boolean funkcjaNieograniczona = false;
    private int[] wspolczynniki; // wspolczynniki
    
    public Sympleks(int liczbaOgraniczen, int liczbaNieznanych){
        rows = liczbaOgraniczen+1; 
        cols = liczbaNieznanych+1;   
        table = new float[rows][]; 
        wspolczynniki= new int[] {3,4};
        
        // inicjalizacja tabeli
        for(int i = 0; i < rows; i++){
            table[i] = new float[cols];
        }
    }
    
    public int[] getWspolczynniki() {
		return wspolczynniki;
	}

	// wypelnij tabele
    public void wypelnijTabele(float[][] data){
        for(int i = 0; i < table.length; i++){
            System.arraycopy(data[i], 0, this.table[i], 0, data[i].length);
        }
    }
    

    public int oblicz(){

        if(sprawdzOptymalnosc()){
            return 1; // solution is optimal
        }
        
 
        int pivotColumn = znajdzKolumne();

        float[] ratios = liczIloraz(pivotColumn);
        if(funkcjaNieograniczona == true)
            return 2;
        int pivotRow = znajdzNajmniejsza(ratios);
        
        wspolczynniki[pivotRow]=pivotColumn;
        

        tworzTabela(pivotRow, pivotColumn);
        
        return 3;
    }
    
    // stworz kolejna tabele
    private void tworzTabela(int pivotRow, int pivotColumn){
        float pivotValue = table[pivotRow][pivotColumn];
        float[] pivotRowVals = new float[cols];
        float[] pivotColumnVals = new float[cols];
        float[] rowNew = new float[cols];
        

        System.arraycopy(table[pivotRow], 0, pivotRowVals, 0, cols);
        
        
        for(int i = 0; i < rows; i++)
            pivotColumnVals[i] = table[i][pivotColumn];
        
        
        for(int  i = 0; i < cols; i++)
            rowNew[i] =  pivotRowVals[i] / pivotValue;
        
        
        for(int i = 0; i < rows; i++){
            if(i != pivotRow){
                for(int j = 0; j < cols; j++){
                    float c = pivotColumnVals[i];
                    table[i][j] = table[i][j] - (c * rowNew[j]);
                }
            }
        }
        
        
        System.arraycopy(rowNew, 0, table[pivotRow], 0, rowNew.length);
    }
    
    // policz ilorazy
    private float[] liczIloraz(int column){
        float[] positiveEntries = new float[rows];
        float[] res = new float[rows];
        int allNegativeCount = 0;
        for(int i = 0; i < rows; i++){
            if(table[i][column] > 0){
                positiveEntries[i] = table[i][column];
            }
            else{
                positiveEntries[i] = 0;
                allNegativeCount++;
            }
            
        }
        
        if(allNegativeCount == rows)
            this.funkcjaNieograniczona = true;
        else{
            for(int i = 0;  i < rows; i++){
                float val = positiveEntries[i];
                if(val > 0){
                    res[i] = table[i][cols -1] / val;
                }
            }
        }
        
        return res;
    }
    
    // znajdz kolumne
    private int znajdzKolumne(){
        float[] values = new float[cols];
        int location = 0;
        
        int pos, count = 0; 
        for(pos = 0; pos < cols-1; pos++){
            if(table[rows-1][pos] < 0){
                
                count++;
                return pos;
            }
        }        
        return location;
    }
    
    
    // znajdz najmniejsza wartosc
    private int znajdzNajmniejsza(float[] data){
        float minimum ;
        int c, location = 0;
        minimum = data[0];
        
        for(c = 1; c < data.length; c++){
            if(data[c] > 0){
                if(Float.compare(data[c], minimum) < 0){
                    minimum = data[c];
                    location  = c;
                }
            }
        }
        
        return location;
    }
    
    
    // sprawdz czy optymalna tabela
    public boolean sprawdzOptymalnosc(){
        boolean isOptimal = false;
        int vCount = 0;
        
        for(int i = 0; i < cols-1; i++){
            float val = table[rows-1][i];
            if(val >= 0){
                vCount++;
            }
        }
        
        if(vCount == cols-1){
            isOptimal = true;
        }
        
        return isOptimal;
    }

    // zwroc tabele sympleksowa
    public float[][] getTable() {
        return table;
    }
}
