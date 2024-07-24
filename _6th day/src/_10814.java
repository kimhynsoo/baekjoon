import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Member> members= new ArrayList<>();


        for (int i=  0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age=Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(age,name,i));

        }

        Collections.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                if(o1.getAge() != o2.getAge()){
                    return o1.getAge()-o2.getAge();
                }
                else{
                    return o1.getJoinorder()-o2.getJoinorder();
                }
            }
        });

        for (Member member : members){
            System.out.println(member.getAge() + " " + member.getName());
        }


    }
}

class Member {
    private int age;
    private String name;
    private int joinorder;

    public Member(int age, String name, int joinorder){
        this.age=age;
        this.name=name;
        this.joinorder=joinorder;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public int getJoinorder(){
        return this.joinorder;
    }
}