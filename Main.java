public class Main {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.name = "Rose";
        plant1.setLeaves(5);
       
    }
}
class Plant{
    int branch;
    String name;
    int leaves;

    void setLeaves(int leaves){
        this.leaves = leaves;
    }
    int getLeaves(){
        return leaves;
    }
}
