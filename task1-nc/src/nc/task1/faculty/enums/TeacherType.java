package nc.task1.faculty.enums;

/**
 * Created by ivan on 20.03.2017.
 */
public enum TeacherType {
   MASTER, ASSIST, CANDIDAT, PROFFESSOR;

   public String getTeacherType(){
      switch (this){
         case MASTER:
            return "Магистр наук";
         case CANDIDAT:
            return "Кандидат технических наук";
         case PROFFESSOR:
            return "Профессор";
         case ASSIST:
            return "какой-то студентик";
      }

      return "замена";
   }
}
