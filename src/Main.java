public class Main {
    public static void main(String[] args) {
    Boss snake = new Boss();
    snake.setHealth(500);
    snake.setDamage(100);
    snake.setTypeDefence("poison");
    System.out.println( "Boss Information:\nhealth: "+
            snake.getHealth()+"\ndamage: " + snake.getDamage()+ "\ntypedefence: " +
            snake.getTypeDefence());
    }
}