import java.util.NoSuchElementException;
class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    current = start;
  }
  public void reset(){
     current = start;
  }
  public int length(){
    return end - start + 1;
  }
  public boolean hasNext(){
    return current != end + 1;
  }

  public int next(){
    try{
      current++;
      return current - 1;
    }catch (NoSuchElementException e){
      throw(e);
    }
  }

}
