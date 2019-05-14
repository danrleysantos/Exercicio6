
public class Disciplina {
    private String Nome;
    private String Codigo;
    private String Periodo;
    
    public Disciplina(String n, String c, String p){
    
        setNome(n);
        setCodigo(c);
        setPeriodo(p);
    }
    
    
    public String getNome(){
    
        return this.Nome;
    }
    
    public String getCodigo(){
    
        return this.Codigo;
    }
    
    public String getPeriodo(){
    
        return this.Periodo;
    }
    
    public void setNome(String n){
    
        this.Nome = n;
    }
    
    public void setCodigo(String c){
    
        this.Codigo = c;
    }
    
    public void setPeriodo(String p){
    
        this.Periodo= p;
    }
}
