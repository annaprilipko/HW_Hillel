package Lesson7.practis1;

public class Main {
    public static void main(String[] args) {
        IHumanLifecycleObserver observer = new LoggingHumanIifecycleObserver();
        HumanLifecycle lifecycle = new HumanLifecycle(observer);

        lifecycle.startLife();
    }

    private static class LoggingHumanIifecycleObserver implements IHumanLifecycleObserver{

        @Override
        public void onHumanWasBorn(HumanBornParams param) {
            System.out.println(
                    String.format("Human was born on %s with weight %.3f and gender %s\n",
                            param.date, param.weight, param.gender));
        }

        @Override
        public void onGoesToKindergarten(KinderGardenParams kinderGardenParams) {
            System.out.printf("In %s year, human goes to kindergarten №%d, group %1s\n",
                    kinderGardenParams.date,
                    kinderGardenParams.kindergartenNum,
                    kinderGardenParams.groupName
            );
        }

        @Override
        public void onGoesToSchool(SchoolParams schoolParams) {
            System.out.printf("In %s year, human goes to school №%d, class \"%1s\" \n",
                    schoolParams.date,
                    schoolParams.schoolNum,
                    schoolParams.className
            );
        }

        @Override
        public void onGoesToUniversity(UniversityParams universityParams, HumanBornParams bornParams) {
            System.out.printf("In %s year, human %s goes to University \"%s\", faculty \"%s\", group \"%s\"\n",
                    universityParams.date,
                    bornParams.name,
                    universityParams.university,
                    universityParams.faculty,
                    universityParams.group
            );
        }

        @Override
        public void onGoesToWork(WorkParams workParams, HumanBornParams bornParams) {
            System.out.printf("In %s year, human %s find job in \"%s\" for the post %s with salary %d UAH\n",
                    workParams.date,
                    bornParams.name,
                    workParams.company,
                    workParams.profession,
                    workParams.salary
            );
        }

        @Override
        public void onCreateFamily(FamilyParams familyParams, HumanBornParams bornParams) {
            System.out.printf("In %s year, %s with %s decided to start a family\n",
                    familyParams.date,
                    bornParams.name,
                    familyParams.partner
            );
        }

        @Override
        public void onHaveKids(HaveKidsParams haveKidsParams, FamilyParams familyParams, HumanBornParams bornParams) {
            System.out.printf("In %s year, %s and %s have kid with name %s, weight %s kilograms and gender %s.\n",
                    haveKidsParams.date,
                    bornParams.name,
                    familyParams.partner,
                    haveKidsParams.childName,
                    haveKidsParams.childWeight,
                    haveKidsParams.childGender
            );
        }

        @Override
        public void onRetired(RetiredParams retiredParams, HumanBornParams bornParams) {
            System.out.printf("In %s year, %s is retired and have a pension %s UAH\n",
                    retiredParams.date,
                    bornParams.name,
                    retiredParams.pension
            );
        }

        @Override
        public void onHumanDied(DeathParams deathParams, HumanBornParams bornParams) {
            System.out.printf("In %s year, %s is die because of %s.\n",
                    deathParams.date,
                    bornParams.name,
                    deathParams.reason
            );
        }
    }

}
