package programmers;

public class skillTrees {
    static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            String skillTemp = skill_trees[i];
            for (int j = 0; j < skillTemp.length(); j++) {
                String oneSkill = String.valueOf(skillTemp.charAt(j));
                if(!skill.contains(oneSkill)) {
                    skill_trees[i] = skill_trees[i].replace(oneSkill, "");
                }
            }
            if (skill.indexOf(skill_trees[i]) == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        System.out.println(solution(skill, skill_trees));
    }
}
