import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){
    this.start = start;
    this.end = end;
    current = 0;
  }
  public void reset(){  }
  public int length(){  }
  public boolean hasNext(){  }

  //@throws NoSuchElementException
  public int next(){    }

}
