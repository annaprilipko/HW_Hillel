package Lesson7.practis1;

public class HumanLifecycle {
    private final IHumanLifecycleObserver observer;

    public HumanLifecycle(IHumanLifecycleObserver observer){
        this.observer = observer;
    }

    public void startLife(){

        /**
         * Human was born
         */
        IHumanLifecycleObserver.HumanBornParams bornParams =
                new IHumanLifecycleObserver.HumanBornParams("Kate", "21.11.2010", 3.62f, "female");
        observer.onHumanWasBorn(bornParams);
        /**
         * Human went to the kindergarden
         */
        IHumanLifecycleObserver.KinderGardenParams kinderGardenParams =
                new IHumanLifecycleObserver.KinderGardenParams("01.08.2013", 11, "A");
        observer.onGoesToKindergarten(kinderGardenParams);
        /**
         * Human went to the school
         */
        IHumanLifecycleObserver.SchoolParams schoolParams =
                new IHumanLifecycleObserver.SchoolParams("01.09.2017", 116, 'A');
        observer.onGoesToSchool(schoolParams);
        /**
         * Human went to the university
         */
        IHumanLifecycleObserver.UniversityParams universityParams =
                new IHumanLifecycleObserver.UniversityParams("01.09.2029", "HPI", "Prog", "P125");
        observer.onGoesToUniversity(universityParams, bornParams);
        /**
         * Human starts working
         */
        IHumanLifecycleObserver.WorkParams workParams =
                new IHumanLifecycleObserver.WorkParams("26.06.2030", "Newspaper", "intern",500);
        observer.onGoesToWork(workParams, bornParams);
        /**
         * Human create a family
         */
        IHumanLifecycleObserver.FamilyParams familyParams =
                new IHumanLifecycleObserver.FamilyParams("04.08.2036", "Den Mails");
        observer.onCreateFamily(familyParams, bornParams);
        /**
         * Human has kids
         */
        IHumanLifecycleObserver.HaveKidsParams haveKidsParams =
                new IHumanLifecycleObserver.HaveKidsParams("05.09.2039", "Moly", "female",
                        3.53f,"mom");
        observer.onHaveKids(haveKidsParams, familyParams, bornParams);
        /**
         * Human retired
         */
        IHumanLifecycleObserver.RetiredParams retiredParams =
                new IHumanLifecycleObserver.RetiredParams("25.09.2076", 13000);
        observer.onRetired(retiredParams, bornParams);
        /**
         * Human die
         */
        IHumanLifecycleObserver.DeathParams deathParams =
                new IHumanLifecycleObserver.DeathParams("08.05.2101", "age");
        observer.onHumanDied(deathParams, bornParams);

    }
}
