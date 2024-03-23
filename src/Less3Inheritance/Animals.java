package Less3Inheritance;

    class Animals implements RunUndSwim {
        String name;
        int maxDistansRun;
        int maxDistansSwim;

        public Animals(String name, int maxDistansRun, int maxDistansSwim) {
            this.name = name;
            this.maxDistansRun = maxDistansRun;
            this.maxDistansSwim = maxDistansSwim;
        }

        @Override
        public void run(int distance) {
            if (distance <= maxDistansRun) {
                System.out.println(name + " біжить " + distance + " метрів");
            } else {
                System.out.println(name + " не може пробігти більше " + maxDistansRun + " метрів");
            }
        }

        @Override
        public void swim(int distance) {
            if (distance <= maxDistansSwim) {
                System.out.println(name + " пливе " + distance + " метрів");
            } else {
                System.out.println(name + " не може пропливти більше " + maxDistansSwim + " метрів");
            }
        }
    }

