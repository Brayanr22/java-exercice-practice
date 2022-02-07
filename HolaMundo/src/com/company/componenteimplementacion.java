package com.company;
@Component
public class componenteimplementacion implements componentedependency{
    @Override
    public void saludar(){
        System.out.println("hola mundo mi primer componente");
    }
}
