public class Main {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();

        Task cutDog = new Task("Подстричь собаку", "Ножницами");
        Task washFloorCreated = taskManager.addTask(cutDog);
        System.out.println(washFloorCreated);
        Task cutDogToUpdate = new Task(cutDog.getId(), "Нужно подстричь собаку", "Можно уже машинкой",
                Status.IN_PROGRESS);
        Task cutDogUpdate = taskManager.updateTask(cutDogToUpdate);
        System.out.println(cutDogUpdate);


        Epic constructionVillage = new Epic("Начать освоение загородного участка", "За лето");
        taskManager.addEpic(constructionVillage);
        System.out.println(constructionVillage);
        Subtask constructionVillageSubtask1 = new Subtask("Установить забор", "Заказать в фирме Заров.ру",
                constructionVillage.getId());
        Subtask constructionVillageSubtask2 = new Subtask("Построить баню", "Строю сам по каркасной технологии",
                constructionVillage.getId());
        taskManager.addSubtask(constructionVillageSubtask1);
        taskManager.addSubtask(constructionVillageSubtask2);
        System.out.println(constructionVillage);
        constructionVillageSubtask2.setStatus(Status.DONE);
        taskManager.updateSubtask(constructionVillageSubtask2);
        System.out.println(constructionVillage);
    }
}