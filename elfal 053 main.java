public class main {

    public static void main(String[] args) {
        Tim coganKompleks = new Tim("Cogan Kompleks");
    
        Member orang_1 = new Member("Lee Jeno", 21);
        Member orang_2 = new Member("Huang Hendery", 22);
        Member orang_3 = new Member("Nakamoto Yuta", 26);

        Member orang_4 = new Trainee("Jeon Wonwoo", 25, 4);
        Member orang_5 = new Trainee("Vernon Chwe", 23, 2);
        Member orang_6 = new Trainee("Eisa", 24, 3);
        
        coganKompleks.addMember(orang_1);
        coganKompleks.addMember(orang_2);
        coganKompleks.addMember(orang_3);
        coganKompleks.addMember(orang_4);
        coganKompleks.addMember(orang_5);
        coganKompleks.addMember(orang_6);
        
        coganKompleks.displayFullMember();
        coganKompleks.displayTrainee();
    }
    
}