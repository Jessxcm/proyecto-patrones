package mundo;



public class FacadeSpaceInvaders  {
    

	
	
	
	private static FacadeSpaceInvaders fachada; //singleton
	
	

	
	//singleton de la creacion de la fachada
    public static  FacadeSpaceInvaders getInstance() { 
    	if (fachada==null){
    		fachada = new FacadeSpaceInvaders();	
        }
    	
        return fachada;
    }

    
    
    private FacadeSpaceInvaders() {

    }
    
    

   
    
    
   
    
    
}
