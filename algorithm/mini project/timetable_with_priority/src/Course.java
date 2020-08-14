import java.util.ArrayList;

public class Course implements Comparable<Course> {

   private int courseNum, courseCre;
   private String courseTime, courseName, professor;
   private int importance = 0;
   private ArrayList<int[]> trans = new ArrayList<int[]>();
   private int cmp;
   private int top;
   private int bottom;
   
   public Course (int courseNum, String courseName, int courseCre, String courseTime, String professor)
   {
      this.courseNum = courseNum;
      this.courseName = courseName;
      this.courseCre = courseCre;
      this.courseTime = courseTime;
      this.professor = professor;
   }
   
   public int getcourseNum()
   {
      return courseNum;
   }
   
   public String getcourseName()
   {
      return courseName;
   }
   public int getcourseCre()
   {
      return courseCre;
   }
   public String getcourseTime()
   {
      return courseTime;
   }
   public String getprofessor()
   {
      return professor;
   }
   public int getimportance()
   {
      return importance;
   }
   public ArrayList<int[]> gettrans()
   {
      return trans;
   }
   public int getcmp()
   {
      return cmp;
   }
   public int gettop()
   {
      return top;
   }
   public int getbottom()
   {
      return bottom;
   }

   public void setcourseNum(int courseNum)
   {
      this.courseNum = courseNum;
   }
   public void setcourseName(String courseName)
   {
      this.courseName = courseName;
   }
   public void setcourseCre(int courseCre)
   {
      this.courseCre = courseCre;
   }
   public void setcourseTime(String courseTime)
   {
      this.courseTime = courseTime;
   }
   public void setprofessor(String professor)
   {
      this.professor = professor;
   }
   public void setimportance(int importance)
   {
      this.importance = importance;
   }
   public void setcmp(int cmp)
   {
      this.cmp = cmp;
   }
   public void settop(int top)
   {
      this.top = top;
   }
   public void setbottom(int bottom)
   {
      this.bottom = bottom;
   }

   // �ʼ� ������ �߿䵵���� �����ϱ� ���� �޼ҵ�
   @Override
   public int compareTo(Course o) {
      /*
      if(this.importance < o.getimportance())
      {
         return -1;
      }
      else if(this.importance > o.getimportance())
      {
         return 1;
      }
      return 0;
      */
      
      /*
        // �߿䵵�� ����
      if(this.getimportance() != 0)
      {
         if(this.importance < o.getimportance())
         {
            return -1;
         }
         else if(this.importance > o.getimportance())
         {
            return 1;
         }
         return 0;
      }
      else
      {
         // ���� �ð����� ����
           if((this.cmp == 2))
           {
              return -1;
           }
           else if(this.cmp < o.getcmp())
           {
              return -1;
           }
           else if(this.cmp > o.getcmp())
           {
              return 1;
           }

           // ���� �ð� ���� �� ������ ����
           return Integer.compare(this.courseCre, o.getcourseCre());
      }
      */
      
        // �߿䵵�� ����
        int importanceResult = Integer.compare(this.importance, o.getimportance());
        if (importanceResult != 0)
        {
            return importanceResult;
        }

        // �����ð����� ����
        int cmpResult = Integer.compare(this.cmp, o.getcmp());
        if (cmpResult != 0)
        {
            return cmpResult;
        }

        // �������� ����
        return Integer.compare(this.courseCre, o.getcourseCre()) * -1;
   }
   
   // String ���� �Էµ� �ð��� �ð�ǥ�� �ֱ� ���� int �������� �ٲ��ִ� �޼ҵ�
   public void timeTranslator()
   {      
      String spl[] = courseTime.split(",");
      
      for(int i = 0; i < spl.length; i++)
      {
         int[] arr = new int[2];

         // ��
         if(spl[i].trim().equalsIgnoreCase("��1"))
         {
            arr[1] = 0;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��2"))
         {
            arr[1] = 0;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��3"))
         {
            arr[1] = 0;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��4"))
         {
            arr[1] = 0;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��5"))
         {
            arr[1] = 0;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��6"))
         {
            arr[1] = 0;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��7"))
         {
            arr[1] = 0;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��8"))
         {
            arr[1] = 0;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��9"))
         {
            arr[1] = 0;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��10"))
         {
            arr[1] = 0;
            arr[0] = 9;
            trans.add(arr);
         }

         // ȭ
         if(spl[i].trim().equalsIgnoreCase("ȭ1"))
         {
            arr[1] = 1;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ2"))
         {
            arr[1] = 1;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ3"))
         {
            arr[1] = 1;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ4"))
         {
            arr[1] = 1;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ5"))
         {
            arr[1] = 1;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ6"))
         {
            arr[1] = 1;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ7"))
         {
            arr[1] = 1;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ8"))
         {
            arr[1] = 1;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ9"))
         {
            arr[1] = 1;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("ȭ10"))
         {
            arr[1] = 1;
            arr[0] = 9;
            trans.add(arr);
         }

         // ��
         if(spl[i].trim().equalsIgnoreCase("��1"))
         {
            arr[1] = 2;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��2"))
         {
            arr[1] = 2;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��3"))
         {
            arr[1] = 2;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��4"))
         {
            arr[1] = 2;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��5"))
         {
            arr[1] = 2;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��6"))
         {
            arr[1] = 2;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��7"))
         {
            arr[1] = 2;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��8"))
         {
            arr[1] = 2;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��9"))
         {
            arr[1] = 2;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��10"))
         {
            arr[1] = 2;
            arr[0] = 9;
            trans.add(arr);
         }

         // ��
         if(spl[i].trim().equalsIgnoreCase("��1"))
         {
            arr[1] = 3;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��2"))
         {
            arr[1] = 3;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��3"))
         {
            arr[1] = 3;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��4"))
         {
            arr[1] = 3;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��5"))
         {
            arr[1] = 3;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��6"))
         {
            arr[1] = 3;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��7"))
         {
            arr[1] = 3;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��8"))
         {
            arr[1] = 3;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��9"))
         {
            arr[1] = 3;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��10"))
         {
            arr[1] = 3;
            arr[0] = 9;
            trans.add(arr);
         }

         // ��
         if(spl[i].trim().equalsIgnoreCase("��1"))
         {
            arr[1] = 4;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��2"))
         {
            arr[1] = 4;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��3"))
         {
            arr[1] = 4;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��4"))
         {
            arr[1] = 4;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��5"))
         {
            arr[1] = 4;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��6"))
         {
            arr[1] = 4;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��7"))
         {
            arr[1] = 4;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��8"))
         {
            arr[1] = 4;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��9"))
         {
            arr[1] = 4;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("��10"))
         {
            arr[1] = 4;
            arr[0] = 9;
            trans.add(arr);
         }

         
      }
      
   }
}