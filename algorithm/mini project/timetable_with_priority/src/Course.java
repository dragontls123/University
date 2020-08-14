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

   // 필수 과목을 중요도별로 정렬하기 위한 메소드
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
        // 중요도로 정렬
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
         // 공강 시간으로 정렬
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

           // 공강 시간 정렬 후 학점순 정렬
           return Integer.compare(this.courseCre, o.getcourseCre());
      }
      */
      
        // 중요도로 정렬
        int importanceResult = Integer.compare(this.importance, o.getimportance());
        if (importanceResult != 0)
        {
            return importanceResult;
        }

        // 공강시간으로 정렬
        int cmpResult = Integer.compare(this.cmp, o.getcmp());
        if (cmpResult != 0)
        {
            return cmpResult;
        }

        // 학점으로 정렬
        return Integer.compare(this.courseCre, o.getcourseCre()) * -1;
   }
   
   // String 으로 입력된 시간을 시간표에 넣기 위한 int 형식으로 바꿔주는 메소드
   public void timeTranslator()
   {      
      String spl[] = courseTime.split(",");
      
      for(int i = 0; i < spl.length; i++)
      {
         int[] arr = new int[2];

         // 월
         if(spl[i].trim().equalsIgnoreCase("월1"))
         {
            arr[1] = 0;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월2"))
         {
            arr[1] = 0;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월3"))
         {
            arr[1] = 0;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월4"))
         {
            arr[1] = 0;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월5"))
         {
            arr[1] = 0;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월6"))
         {
            arr[1] = 0;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월7"))
         {
            arr[1] = 0;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월8"))
         {
            arr[1] = 0;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월9"))
         {
            arr[1] = 0;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("월10"))
         {
            arr[1] = 0;
            arr[0] = 9;
            trans.add(arr);
         }

         // 화
         if(spl[i].trim().equalsIgnoreCase("화1"))
         {
            arr[1] = 1;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화2"))
         {
            arr[1] = 1;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화3"))
         {
            arr[1] = 1;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화4"))
         {
            arr[1] = 1;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화5"))
         {
            arr[1] = 1;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화6"))
         {
            arr[1] = 1;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화7"))
         {
            arr[1] = 1;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화8"))
         {
            arr[1] = 1;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화9"))
         {
            arr[1] = 1;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("화10"))
         {
            arr[1] = 1;
            arr[0] = 9;
            trans.add(arr);
         }

         // 수
         if(spl[i].trim().equalsIgnoreCase("수1"))
         {
            arr[1] = 2;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수2"))
         {
            arr[1] = 2;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수3"))
         {
            arr[1] = 2;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수4"))
         {
            arr[1] = 2;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수5"))
         {
            arr[1] = 2;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수6"))
         {
            arr[1] = 2;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수7"))
         {
            arr[1] = 2;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수8"))
         {
            arr[1] = 2;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수9"))
         {
            arr[1] = 2;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("수10"))
         {
            arr[1] = 2;
            arr[0] = 9;
            trans.add(arr);
         }

         // 목
         if(spl[i].trim().equalsIgnoreCase("목1"))
         {
            arr[1] = 3;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목2"))
         {
            arr[1] = 3;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목3"))
         {
            arr[1] = 3;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목4"))
         {
            arr[1] = 3;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목5"))
         {
            arr[1] = 3;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목6"))
         {
            arr[1] = 3;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목7"))
         {
            arr[1] = 3;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목8"))
         {
            arr[1] = 3;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목9"))
         {
            arr[1] = 3;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("목10"))
         {
            arr[1] = 3;
            arr[0] = 9;
            trans.add(arr);
         }

         // 금
         if(spl[i].trim().equalsIgnoreCase("금1"))
         {
            arr[1] = 4;
            arr[0] = 0;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금2"))
         {
            arr[1] = 4;
            arr[0] = 1;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금3"))
         {
            arr[1] = 4;
            arr[0] = 2;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금4"))
         {
            arr[1] = 4;
            arr[0] = 3;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금5"))
         {
            arr[1] = 4;
            arr[0] = 4;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금6"))
         {
            arr[1] = 4;
            arr[0] = 5;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금7"))
         {
            arr[1] = 4;
            arr[0] = 6;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금8"))
         {
            arr[1] = 4;
            arr[0] = 7;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금9"))
         {
            arr[1] = 4;
            arr[0] = 8;
            trans.add(arr);
         }
         else if(spl[i].trim().equalsIgnoreCase("금10"))
         {
            arr[1] = 4;
            arr[0] = 9;
            trans.add(arr);
         }

         
      }
      
   }
}