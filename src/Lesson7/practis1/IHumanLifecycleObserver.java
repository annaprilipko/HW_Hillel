package Lesson7.practis1;

public interface IHumanLifecycleObserver {
    void onHumanWasBorn(HumanBornParams bornParams);

    void onGoesToKindergarten(KinderGardenParams kinderGardenParams);

    void onGoesToSchool(SchoolParams schoolParams);

    void onGoesToUniversity(UniversityParams universityParams, HumanBornParams bornParams);

    void onGoesToWork(WorkParams workParams, HumanBornParams bornParams);

    void onCreateFamily(FamilyParams familyParams, HumanBornParams bornParams);

    void onHaveKids(HaveKidsParams haveKidsParams, FamilyParams familyParams, HumanBornParams bornParams);

    void onRetired(RetiredParams retiredParams, HumanBornParams bornParams);

    void onHumanDied(DeathParams deathParams, HumanBornParams bornParams);

    class HumanBornParams{
        String name;
        String date;
        Float weight;
        String gender;

        public HumanBornParams(String name, String date, Float weight, String gender) {
            this.name = name;
            this.date = date;
            this.weight = weight;
            this.gender = gender;
        }
    }

    class KinderGardenParams {
        String date;
        int kindergartenNum;
        String groupName;

        public KinderGardenParams(String date, int kindergartenNum, String groupName) {
            this.date = date;
            this.kindergartenNum = kindergartenNum;
            this.groupName = groupName;
        }
    }

    class SchoolParams{
        String date;
        int schoolNum;
        char className;

        public SchoolParams(String date, int schoolNum, char className) {
            this.date = date;
            this.schoolNum = schoolNum;
            this.className = className;
        }
    }

    class UniversityParams{
        String date;
        String university;
        String faculty;
        String group;

        public UniversityParams(String date, String university, String faculty, String group) {
            this.date = date;
            this.university = university;
            this.faculty = faculty;
            this.group = group;
        }
    }

    class WorkParams{
        String date;
        String company;
        String profession;
        int salary;

        public WorkParams(String date, String company, String profession, int salary) {
            this.date = date;
            this.company = company;
            this.profession = profession;
            this.salary = salary;
        }
    }

    class FamilyParams{
        String date;
        String partner;

        public FamilyParams(String date, String partner) {
            this.date = date;
            this.partner = partner;
        }
    }

    class HaveKidsParams{
        String date;
        String childName;
        String childGender;
        Float childWeight;
        String looksLike;

        public HaveKidsParams(String date, String childName, String childGender, Float childWeight, String looksLike) {
            this.date = date;
            this.childName = childName;
            this.childGender = childGender;
            this.childWeight = childWeight;
            this.looksLike = looksLike;
        }
    }

    class RetiredParams{
        String date;
        int pension;

        public RetiredParams(String date, int pension) {
            this.date = date;
            this.pension = pension;
        }
    }

    class DeathParams{
        String date;
        String reason;

        public DeathParams(String date, String reason) {
            this.date = date;
            this.reason = reason;
        }
    }
}
