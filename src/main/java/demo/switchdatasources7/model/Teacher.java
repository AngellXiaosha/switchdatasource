package demo.switchdatasources7.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1563418542849L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Integer tid;

    /**
    * 
    * isNullAble:0
    */
    private String tname;

    /**
    * 
    * isNullAble:0
    */
    private Integer tage;


    public void setTid(Integer tid){this.tid = tid;}

    public Integer getTid(){return this.tid;}

    public void setTname(String tname){this.tname = tname;}

    public String getTname(){return this.tname;}

    public void setTage(Integer tage){this.tage = tage;}

    public Integer getTage(){return this.tage;}
    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                "tname='" + tname + '\'' +
                "tage='" + tage + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private Teacher set;

        private ConditionBuilder where;

        public UpdateBuilder set(Teacher set){
            this.set = set;
            return this;
        }

        public Teacher getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends Teacher{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> tidList;

        public List<Integer> getTidList(){return this.tidList;}

        private Integer tidSt;

        private Integer tidEd;

        public Integer getTidSt(){return this.tidSt;}

        public Integer getTidEd(){return this.tidEd;}

        private List<String> tnameList;

        public List<String> getTnameList(){return this.tnameList;}


        private List<String> fuzzyTname;

        public List<String> getFuzzyTname(){return this.fuzzyTname;}

        private List<String> rightFuzzyTname;

        public List<String> getRightFuzzyTname(){return this.rightFuzzyTname;}
        private List<Integer> tageList;

        public List<Integer> getTageList(){return this.tageList;}

        private Integer tageSt;

        private Integer tageEd;

        public Integer getTageSt(){return this.tageSt;}

        public Integer getTageEd(){return this.tageEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder tidBetWeen(Integer tidSt,Integer tidEd){
            this.tidSt = tidSt;
            this.tidEd = tidEd;
            return this;
        }

        public QueryBuilder tidGreaterEqThan(Integer tidSt){
            this.tidSt = tidSt;
            return this;
        }
        public QueryBuilder tidLessEqThan(Integer tidEd){
            this.tidEd = tidEd;
            return this;
        }


        public QueryBuilder tid(Integer tid){
            setTid(tid);
            return this;
        }

        public QueryBuilder tidList(Integer ... tid){
            this.tidList = solveNullList(tid);
            return this;
        }

        public QueryBuilder tidList(List<Integer> tid){
            this.tidList = tid;
            return this;
        }

        public QueryBuilder fetchTid(){
            setFetchFields("fetchFields","tid");
            return this;
        }

        public QueryBuilder excludeTid(){
            setFetchFields("excludeFields","tid");
            return this;
        }

        public QueryBuilder fuzzyTname (List<String> fuzzyTname){
            this.fuzzyTname = fuzzyTname;
            return this;
        }

        public QueryBuilder fuzzyTname (String ... fuzzyTname){
            this.fuzzyTname = solveNullList(fuzzyTname);
            return this;
        }

        public QueryBuilder rightFuzzyTname (List<String> rightFuzzyTname){
            this.rightFuzzyTname = rightFuzzyTname;
            return this;
        }

        public QueryBuilder rightFuzzyTname (String ... rightFuzzyTname){
            this.rightFuzzyTname = solveNullList(rightFuzzyTname);
            return this;
        }

        public QueryBuilder tname(String tname){
            setTname(tname);
            return this;
        }

        public QueryBuilder tnameList(String ... tname){
            this.tnameList = solveNullList(tname);
            return this;
        }

        public QueryBuilder tnameList(List<String> tname){
            this.tnameList = tname;
            return this;
        }

        public QueryBuilder fetchTname(){
            setFetchFields("fetchFields","tname");
            return this;
        }

        public QueryBuilder excludeTname(){
            setFetchFields("excludeFields","tname");
            return this;
        }

        public QueryBuilder tageBetWeen(Integer tageSt,Integer tageEd){
            this.tageSt = tageSt;
            this.tageEd = tageEd;
            return this;
        }

        public QueryBuilder tageGreaterEqThan(Integer tageSt){
            this.tageSt = tageSt;
            return this;
        }
        public QueryBuilder tageLessEqThan(Integer tageEd){
            this.tageEd = tageEd;
            return this;
        }


        public QueryBuilder tage(Integer tage){
            setTage(tage);
            return this;
        }

        public QueryBuilder tageList(Integer ... tage){
            this.tageList = solveNullList(tage);
            return this;
        }

        public QueryBuilder tageList(List<Integer> tage){
            this.tageList = tage;
            return this;
        }

        public QueryBuilder fetchTage(){
            setFetchFields("fetchFields","tage");
            return this;
        }

        public QueryBuilder excludeTage(){
            setFetchFields("excludeFields","tage");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public Teacher build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> tidList;

        public List<Integer> getTidList(){return this.tidList;}

        private Integer tidSt;

        private Integer tidEd;

        public Integer getTidSt(){return this.tidSt;}

        public Integer getTidEd(){return this.tidEd;}

        private List<String> tnameList;

        public List<String> getTnameList(){return this.tnameList;}


        private List<String> fuzzyTname;

        public List<String> getFuzzyTname(){return this.fuzzyTname;}

        private List<String> rightFuzzyTname;

        public List<String> getRightFuzzyTname(){return this.rightFuzzyTname;}
        private List<Integer> tageList;

        public List<Integer> getTageList(){return this.tageList;}

        private Integer tageSt;

        private Integer tageEd;

        public Integer getTageSt(){return this.tageSt;}

        public Integer getTageEd(){return this.tageEd;}


        public ConditionBuilder tidBetWeen(Integer tidSt,Integer tidEd){
            this.tidSt = tidSt;
            this.tidEd = tidEd;
            return this;
        }

        public ConditionBuilder tidGreaterEqThan(Integer tidSt){
            this.tidSt = tidSt;
            return this;
        }
        public ConditionBuilder tidLessEqThan(Integer tidEd){
            this.tidEd = tidEd;
            return this;
        }


        public ConditionBuilder tidList(Integer ... tid){
            this.tidList = solveNullList(tid);
            return this;
        }

        public ConditionBuilder tidList(List<Integer> tid){
            this.tidList = tid;
            return this;
        }

        public ConditionBuilder fuzzyTname (List<String> fuzzyTname){
            this.fuzzyTname = fuzzyTname;
            return this;
        }

        public ConditionBuilder fuzzyTname (String ... fuzzyTname){
            this.fuzzyTname = solveNullList(fuzzyTname);
            return this;
        }

        public ConditionBuilder rightFuzzyTname (List<String> rightFuzzyTname){
            this.rightFuzzyTname = rightFuzzyTname;
            return this;
        }

        public ConditionBuilder rightFuzzyTname (String ... rightFuzzyTname){
            this.rightFuzzyTname = solveNullList(rightFuzzyTname);
            return this;
        }

        public ConditionBuilder tnameList(String ... tname){
            this.tnameList = solveNullList(tname);
            return this;
        }

        public ConditionBuilder tnameList(List<String> tname){
            this.tnameList = tname;
            return this;
        }

        public ConditionBuilder tageBetWeen(Integer tageSt,Integer tageEd){
            this.tageSt = tageSt;
            this.tageEd = tageEd;
            return this;
        }

        public ConditionBuilder tageGreaterEqThan(Integer tageSt){
            this.tageSt = tageSt;
            return this;
        }
        public ConditionBuilder tageLessEqThan(Integer tageEd){
            this.tageEd = tageEd;
            return this;
        }


        public ConditionBuilder tageList(Integer ... tage){
            this.tageList = solveNullList(tage);
            return this;
        }

        public ConditionBuilder tageList(List<Integer> tage){
            this.tageList = tage;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private Teacher obj;

        public Builder(){
            this.obj = new Teacher();
        }

        public Builder tid(Integer tid){
            this.obj.setTid(tid);
            return this;
        }
        public Builder tname(String tname){
            this.obj.setTname(tname);
            return this;
        }
        public Builder tage(Integer tage){
            this.obj.setTage(tage);
            return this;
        }
        public Teacher build(){return obj;}
    }

}
