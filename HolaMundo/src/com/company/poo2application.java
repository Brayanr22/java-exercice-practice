package com.company;
import
@springbootapplication
public class poo2application {
    private componentedependency componentedependency;
    //private componenteimplentacion componenteimplentacion;
    public poo2application(componentedependency componentedependency){
        this.componentedependency=componentedependency;
    }
    public static void main(String[] args) {
	SpringApplication.run(poo2application.class, args);
    }
    @Override
    public void run(String... args){
        componentedependency
    }
}
