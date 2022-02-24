import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/** 
 * Extension of ArrayList, that implements the possibility to create a multi-type primitive(also String) ArrayList
 * @author Antonio Condito
 */

public class ObjectList {
    
    private List <Integer> arrayInt;
    private List <Long> arrayLong;
    private List <Short> arrayShort;
    private List <Double> arrayDouble;
    private List <Float> arrayFloat;
    private List <Character> arrayChar;
    private List <Boolean> arrayBoolean;
    private List <Byte> arrayByte;
    private List <String> arrayString;
    
    int n;
    int index = 0;
    
    public ObjectList() {
        this.arrayInt = new ArrayList();
        this.arrayLong = new ArrayList();
        this.arrayShort = new ArrayList();
        this.arrayDouble = new ArrayList();
        this.arrayFloat = new ArrayList();
        this.arrayChar = new ArrayList();
        this.arrayBoolean = new ArrayList();
        this.arrayByte = new ArrayList();
        this.arrayString = new ArrayList();
    }
   
    /** 
     * Adds an element at the end of the list
     * @param element (int) Element to add
     */
    public void append(int element) {
        this.n = 0;
        this.addCell();
        this.arrayInt.add(element); 
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (long) Element to add
     */
    public void append(long element) {
        this.n = 1;
        this.addCell();
        this.arrayLong.add(element); 
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (short) Element to add
     */
    public void append(short element) {
        this.n = 2;
        this.addCell();
        this.arrayShort.add(element);
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (double) Element to add
     */
    public void append(double element) {
        this.n = 3;
        this.addCell();
        this.arrayDouble.add(element);
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (float) Element to add
     */
    public void append(float element) {
        this.n = 4;
        this.addCell();
        this.arrayFloat.add(element); 
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (char) Element to add
     */
    public void append(char element) {
        this.n = 5;
        this.addCell();
        this.arrayChar.add(element);
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (boolean) Element to add
     */
    public void append(boolean element) {
        this.n = 6;
        this.addCell();
        this.arrayBoolean.add(element); 
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (byte) Element to add
     */
    public void append(byte element) {
        this.n = 7;
        this.addCell();
        this.arrayByte.add(element);
        this.index++;
    }
    
    /** 
     * Adds an element at the end of the list
     * @param element (String) Element to add
     */
    public void append(String element) {
        this.n = 8;
        this.addCell();
        this.arrayString.add(element);
        this.index++;
    }
    
    /** 
     * Removes the element at the specified position
     * @param index (int) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void pop(int index) throws IndexOutOfBoundsException {
        this.arrayInt.remove(index);
        this.arrayLong.remove(index);
        this.arrayShort.remove(index);
        this.arrayDouble.remove(index);
        this.arrayFloat.remove(index);
        this.arrayChar.remove(index);
        this.arrayBoolean.remove(index);
        this.arrayByte.remove(index);
        this.arrayString.remove(index);
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (int) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(int element) throws IndexOutOfBoundsException {
        this.n = 0;
        this.removeCell(this.arrayInt.indexOf(element));
        this.arrayInt.remove(this.arrayInt.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (long) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(long element) throws IndexOutOfBoundsException {
        this.n = 1;
        this.removeCell(this.arrayLong.indexOf(element));
        this.arrayLong.remove(this.arrayLong.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (short) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(short element) throws IndexOutOfBoundsException {
        this.n = 2;
        this.removeCell(this.arrayShort.indexOf(element));
        this.arrayShort.remove(this.arrayShort.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (double) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(double element) throws IndexOutOfBoundsException {
        this.n = 3;        
        this.removeCell(this.arrayDouble.indexOf(element));
        this.arrayDouble.remove(this.arrayDouble.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (float) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(float element) throws IndexOutOfBoundsException {
        this.n = 4;        
        this.removeCell(this.arrayFloat.indexOf(element));
        this.arrayFloat.remove(this.arrayFloat.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (char) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(char element) throws IndexOutOfBoundsException {
        this.n = 5;
        this.removeCell(this.arrayChar.indexOf(element));
        this.arrayChar.remove(this.arrayChar.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (boolean) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(boolean element) throws IndexOutOfBoundsException {
        this.n = 6;
        this.removeCell(this.arrayBoolean.indexOf(element));
        this.arrayBoolean.remove(this.arrayBoolean.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (byte) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(byte element) throws IndexOutOfBoundsException {
        this.n = 7;
        this.removeCell(this.arrayByte.indexOf(element));
        this.arrayByte.remove(this.arrayByte.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes the first item with the specified value
     * @param element (String) index of the element to be removed
     * @throws IndexOutOfBoundsException
     */
    public void remove(String element) throws IndexOutOfBoundsException {
        this.n = 8;        
        this.removeCell(this.arrayString.indexOf(element));
        this.arrayString.remove(this.arrayString.indexOf(element));
        this.index--;
    }
    
    /** 
     * Removes all the elements from the list
     */
    public void clear() {
        this.arrayInt.clear();
        this.arrayLong.clear();
        this.arrayShort.clear();
        this.arrayDouble.clear();
        this.arrayFloat.clear();
        this.arrayChar.clear();
        this.arrayBoolean.clear();
        this.arrayByte.clear();
        this.arrayString.clear();
        this.index = 0;
    }
    
    /** 
     * Returns the element at specified position
     * @param index (int) index of the element to return
     * @return Object
     * @throws IndexOutOfBoundsException
     */
    public Object get(int index) throws IndexOutOfBoundsException {
        if(this.arrayInt.get(index) != null) return this.arrayInt.get(index);
        else if(this.arrayLong.get(index) != null) return this.arrayLong.get(index);
        else if(this.arrayShort.get(index) != null) return this.arrayShort.get(index);
        else if(this.arrayDouble.get(index) != null) return this.arrayDouble.get(index);
        else if(this.arrayFloat.get(index) != null) return this.arrayFloat.get(index);
        else if(this.arrayChar.get(index) != null) return this.arrayChar.get(index);
        else if(this.arrayBoolean.get(index) != null) return this.arrayBoolean.get(index);
        else if(this.arrayByte.get(index) != null) return this.arrayByte.get(index);
        else if(this.arrayString.get(index) != null) return this.arrayString.get(index);
        return null;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (int) element to count
     * @return int
     */
    public int count(int element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayInt.get(i) != null && this.arrayInt.get(i) == element) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (long) element to count
     * @return int
     */
    public int count(long element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayLong.get(i) != null && this.arrayLong.get(i) == element) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (short) element to count
     * @return int
     */
    public int count(short element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayShort.get(i) != null && this.arrayShort.get(i) == element) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (double) element to count
     * @return int
     */
    public int count(double element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayDouble.get(i) != null && this.arrayDouble.get(i) == element) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (float) element to count
     * @return int
     */
    public int count(float element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayFloat.get(i) != null && this.arrayFloat.get(i) == element) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (char) element to count
     * @return int
     */
    public int count(char element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayChar.get(i) != null && this.arrayChar.get(i) == element) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (boolean) element to count
     * @return int
     */
    public int count(boolean element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayBoolean.get(i) != null && this.arrayBoolean.get(i) == element) {
            counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (byte) element to count
     * @return int
     */
    public int count(byte element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayByte.get(i) != null && this.arrayByte.get(i) == element) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the number of elements with the specified value
     * @param element (String) element to count
     * @return int
     */
    public int count(String element) {
        int counter = 0;
        for(int i = 0; i < this.index; i++) {
            if(this.arrayString.get(i) != null && this.arrayString.get(i).equals(element)) {
                counter++;
            } 
        }
        return counter;
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (int) element to find the index
     * @return int
     */
    public int indexOf(int element) {
        return this.arrayInt.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (long) element to find the index
     * @return int
     */
    public int indexOf(long element) {
        return this.arrayLong.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (short) element to find the index
     * @return int
     */
    public int indexOf(short element) {
        return this.arrayShort.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (double) element to find the index
     * @return int
     */
    public int indexOf(double element) {
        return this.arrayDouble.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (float) element to find the index
     * @return int
     */
    public int indexOf(float element) {
        return this.arrayFloat.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (char) element to find the index
     * @return int
     */
    public int indexOf(char element) {
        return this.arrayChar.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (boolean) element to find the index
     * @return int
     */
    public int indexOf(boolean element) {
        return this.arrayBoolean.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (byte) element to find the index
     * @return int
     */
    public int indexOf(byte element) {
        return this.arrayByte.indexOf(element);
    }
    
    /** 
     * Returns the index of the first element with the specified value
     * @param element (String) element to find the index
     * @return int
     */
    public int indexOf(String element) {
        return this.arrayString.indexOf(element);
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (int) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(int element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayInt.get(i) != null && this.arrayInt.get(i) == element){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (long) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(long element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayLong.get(i) != null && Objects.equals(element, this.arrayLong.get(i))){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (short) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(short element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayShort.get(i) != null && this.arrayShort.get(i) == element){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (double) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(double element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayDouble.get(i) != null && this.arrayDouble.get(i) == element){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (float) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(float element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayFloat.get(i) != null && this.arrayFloat.get(i) == element){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (char) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(char element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayChar.get(i) != null && this.arrayChar.get(i) == element){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (boolean) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(boolean element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayBoolean.get(i) != null && this.arrayBoolean.get(i) == element){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (byte) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(byte element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayByte.get(i) != null && this.arrayByte.get(i) == element){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Returns an array with the indexs of all the occurences of the specified value
     * @param element (String) element to find the index
     * @return int[]
     */
    public int[] indexOfAll(String element) {
        List <Integer> positions;
        positions = new ArrayList();
        
        for(int i = 0; i < this.index; i++) {
            if(this.arrayString.get(i) != null  && this.arrayString.get(i).equals(element)){
                positions.add(i);
            }
        }
        int p[] = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            p[i] = positions.get(i);
        }
        return p; 
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (ObjectList) element to find the index
     */
    public void extend(ObjectList list) {
        for(int i = 0; i < list.length(); i++) {
            if(list.arrayInt.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayInt.add(list.arrayInt.get(i));
                this.index++;
            } else if(list.arrayLong.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayLong.add(list.arrayLong.get(i));
                this.index++;
            } else if(list.arrayShort.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayShort.add(list.arrayShort.get(i));
                this.index++;    
            } else if(list.arrayDouble.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayDouble.add(list.arrayDouble.get(i));
                this.index++;    
            } else if(list.arrayFloat.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayFloat.add(list.arrayFloat.get(i));
                this.index++;    
            } else if(list.arrayChar.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayChar.add(list.arrayChar.get(i));
                this.index++;    
            } else if(list.arrayBoolean.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayBoolean.add(list.arrayBoolean.get(i));
                this.index++;    
            } else if(list.arrayByte.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayByte.add(list.arrayByte.get(i));
                this.index++;    
            } else if(list.arrayString.get(i) != null) {
                this.n = 0;
                this.addCell(); 
                this.arrayString.add(list.arrayString.get(i));
                this.index++;    
            }
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (int[]) element to find the index
     */
    public void extend(int[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 0;
                this.addCell(); 
                this.arrayInt.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (long[]) element to find the index
     */
    public void extend(long[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 1;
                this.addCell(); 
                this.arrayLong.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (short[]) element to find the index
     */
    public void extend(short[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 2;
                this.addCell(); 
                this.arrayShort.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (double[]) element to find the index
     */
    public void extend(double[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 3;
                this.addCell(); 
                this.arrayDouble.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (float[]) element to find the index
     */
    public void extend(float[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 4;
                this.addCell(); 
                this.arrayFloat.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (char[]) element to find the index
     */
    public void extend(char[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 5;
                this.addCell(); 
                this.arrayChar.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (boolean[]) element to find the index
     */
    public void extend(boolean[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 6;
                this.addCell(); 
                this.arrayBoolean.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (byte[]) element to find the index
     */
    public void extend(byte[] list) {
        for(int i = 0; i < list.length; i++) {
                this.n = 7;
                this.addCell(); 
                this.arrayByte.add(list[i]);
                this.index++;
        }
    }
    
    /** 
     * Add the elements of a list (or any iterable), to the end of the current list
     * @param list (String[]) element to find the index
     */
    public void extend(String[] list) {
        for (int i = 0; i < list.length; i++) {
            this.n = 8;
            this.addCell();
            this.arrayString.add(list[i]);
            this.index++;
        }
    }
    
    /** 
     * Returns a copy of the list. WARNING: If the list passed as a parameter is busy, it clears first 
     * @param newList (ObjectList) list where copy the other list  
     */
    public void copy(ObjectList newList) {
        newList.clear();
        for(int i = 0; i < this.index; i++) {
            if(this.arrayInt.get(i) != null) {
                newList.append(this.arrayInt.get(i));
            } else if(this.arrayLong.get(i) != null) {
                newList.append(this.arrayLong.get(i));
            } else if(this.arrayShort.get(i) != null) {
                newList.append(this.arrayShort.get(i));
            } else if(this.arrayDouble.get(i) != null) {
                newList.append(this.arrayDouble.get(i));
            } else if(this.arrayFloat.get(i) != null) {
                newList.append(this.arrayFloat.get(i));
            } else if(this.arrayChar.get(i) != null) {
                newList.append(this.arrayChar.get(i));
            } else if(this.arrayBoolean.get(i) != null) {
                newList.append(this.arrayBoolean.get(i));
            } else if(this.arrayByte.get(i) != null) {
                newList.append(this.arrayByte.get(i));
            } else if(this.arrayString.get(i) != null) {
                newList.append(this.arrayString.get(i));
            }
        }
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (int) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, int element) throws IndexOutOfBoundsException {
        this.n = 0;
        this.arrayInt.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (long) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, long element) throws IndexOutOfBoundsException {
        this.n = 1;
        this.arrayLong.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (short) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, short element) throws IndexOutOfBoundsException {
        this.n = 2;
        this.arrayShort.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (double) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, double element) throws IndexOutOfBoundsException {
        this.n = 3;
        this.arrayDouble.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (float) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, float element) throws IndexOutOfBoundsException {
        this.n = 4;
        this.arrayFloat.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (char) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, char element) throws IndexOutOfBoundsException {
        this.n = 5;
        this.arrayChar.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (boolean) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, boolean element) throws IndexOutOfBoundsException {
        this.n = 6;
        this.arrayBoolean.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (byte) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, byte element) throws IndexOutOfBoundsException {
        this.n = 7;
        this.arrayByte.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Adds an element at the specified position
     * @param index (int) position where to add the element
     * @param element (String) element to add
     * @throws IndexOutOfBoundsException
     */
    public void insert(int index, String element) throws IndexOutOfBoundsException {
        this.n = 8;
        this.arrayString.add(index, element);
        addBlankCell(index);
        this.index++;
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (int) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, int element) throws IndexOutOfBoundsException {
        this.n = 0;
        setBlankCell(index);
        this.arrayInt.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (long) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, long element) throws IndexOutOfBoundsException {
        this.n = 1;
        setBlankCell(index);
        this.arrayLong.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (short) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, short element) throws IndexOutOfBoundsException {
        this.n = 2;
        setBlankCell(index);
        this.arrayShort.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (double) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, double element) throws IndexOutOfBoundsException {
        this.n = 3;
        setBlankCell(index);
        this.arrayDouble.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (float) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, float element) throws IndexOutOfBoundsException {
        this.n = 4;
        setBlankCell(index);
        this.arrayFloat.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (char) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, char element) throws IndexOutOfBoundsException {
        this.n = 5;
        setBlankCell(index);
        this.arrayChar.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (boolean) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, boolean element) throws IndexOutOfBoundsException {
        this.n = 6;
        setBlankCell(index);
        this.arrayBoolean.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (byte) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, byte element) throws IndexOutOfBoundsException {
        this.n = 7;
        setBlankCell(index);
        this.arrayByte.set(index, element);
    }
    
    /** 
     * Imposts the item with the specified value in the specified position
     * @param index (int) position where to set the element
     * @param element (String) element to set
     * @throws IndexOutOfBoundsException
     */
    public void set(int index, String element) throws IndexOutOfBoundsException {
        this.n = 8;
        setBlankCell(index);
        this.arrayString.set(index, element);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, int newElement ) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(int oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayInt.indexOf(oldElement), newElement);
        this.arrayInt.set(this.arrayInt.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(long oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayLong.indexOf(oldElement), newElement);
        this.arrayLong.set(this.arrayLong.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(short oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayShort.indexOf(oldElement), newElement);
        this.arrayShort.set(this.arrayShort.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(double oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayDouble.indexOf(oldElement), newElement);
        this.arrayDouble.set(this.arrayDouble.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(float oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayFloat.indexOf(oldElement), newElement);
        this.arrayFloat.set(this.arrayFloat.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(char oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayChar.indexOf(oldElement), newElement);
        this.arrayChar.set(this.arrayChar.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(boolean oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayBoolean.indexOf(oldElement), newElement);
        this.arrayBoolean.set(this.arrayBoolean.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(byte oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayByte.indexOf(oldElement), newElement);
        this.arrayByte.set(this.arrayByte.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, int newElement) throws IndexOutOfBoundsException {
        this.arrayInt.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, long newElement) throws IndexOutOfBoundsException {
        this.arrayLong.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, short newElement) throws IndexOutOfBoundsException {
        this.arrayShort.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, double newElement) throws IndexOutOfBoundsException {
        this.arrayDouble.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, float newElement) throws IndexOutOfBoundsException {
        this.arrayFloat.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, char newElement) throws IndexOutOfBoundsException {
        this.arrayChar.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, boolean newElement) throws IndexOutOfBoundsException {
        this.arrayBoolean.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, byte newElement) throws IndexOutOfBoundsException {
        this.arrayByte.set(this.arrayString.indexOf(oldElement), newElement);
        this.arrayString.set(this.arrayString.indexOf(oldElement), null);
    }
    
    /** 
     * Replaces the first occurence of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replace(String oldElement, String newElement) throws IndexOutOfBoundsException {
        this.arrayString.set(this.arrayString.indexOf(oldElement), newElement);
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (int) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(int oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }   
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (long) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(long oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (short) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(short oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (double) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(double oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (float) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(float oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (char) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(char oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (boolean) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(boolean oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (byte) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(byte oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (int) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, int newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (long) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, long newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (short) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, short newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (double) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, double newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (float) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, float newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (char) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, char newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (boolean) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, boolean newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (byte) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, byte newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Replaces all the occurences of the passed value with the other passed value
     * @param oldElement (String) element to replace
     * @param newElement (String) new element 
     * @throws IndexOutOfBoundsException
     */
    public void replaceAll(String oldElement, String newElement) throws IndexOutOfBoundsException {
        int counter = this.count(oldElement);
        for(int i = 0; i < counter; i++) {
            this.replace(oldElement, newElement);
        }
    }
    
    /** 
     * Reverses the order of the list
     */
    public void reverse() {
        Collections.reverse(this.arrayInt);
        Collections.reverse(this.arrayLong);
        Collections.reverse(this.arrayShort);
        Collections.reverse(this.arrayDouble);
        Collections.reverse(this.arrayFloat);
        Collections.reverse(this.arrayChar);
        Collections.reverse(this.arrayBoolean);
        Collections.reverse(this.arrayByte);
        Collections.reverse(this.arrayString);
    }
    
    /** 
     * Returns the length of the list
     * @return int
     */
    public int length() {
        return this.index;
    }
    
    /** 
     * Returns the list
     * @return String
     */
    @Override
    public String toString() {
      
        if(index == 0) {
            return "[]";
            
        } else {
            String string = "[";
            
            for(int i = 0; i < this.index; i++) {
            
                if(this.arrayInt.get(i) != null) {
                    string += this.arrayInt.get(i);
                } else if(this.arrayLong.get(i) != null) {
                    string += this.arrayLong.get(i);
                } else if(this.arrayShort.get(i) != null) {
                    string += this.arrayShort.get(i);
                } else if(this.arrayDouble.get(i) != null) {
                    string += this.arrayDouble.get(i);
                } else if(this.arrayFloat.get(i) != null) {
                    string += this.arrayFloat.get(i);
                } else if(this.arrayChar.get(i) != null) {
                    string += "'" + this.arrayChar.get(i) + "'";
                } else if(this.arrayBoolean.get(i) != null) {
                    string += this.arrayBoolean.get(i);
                } else if(this.arrayByte.get(i) != null) {
                    string += this.arrayByte.get(i);
                } else if(this.arrayString.get(i) != null) {
                    string += "\"" + this.arrayString.get(i) + "\"";
                }
            
                string += ", ";
            }
        
            string = string.substring(0, string.length() - 2) + "]";
                
            return string;
        }   
    }
    
    /** 
     * Add a cell in every array
     */
    private void addCell() {
        if(n != 0) this.arrayInt.add(null);
        if(n != 1) this.arrayLong.add(null);
        if(n != 2) this.arrayShort.add(null);
        if(n != 3) this.arrayDouble.add(null);
        if(n != 4) this.arrayFloat.add(null);
        if(n != 5) this.arrayChar.add(null);
        if(n != 6) this.arrayBoolean.add(null);
        if(n != 7) this.arrayByte.add(null);
        if(n != 8) this.arrayString.add(null);
    }
    
    /** 
     * Add a cell in a specific position in every array
     */
    private void addBlankCell(int index) {
        if(n != 0) this.arrayInt.add(index, null);
        if(n != 1) this.arrayLong.add(index, null);
        if(n != 2) this.arrayShort.add(index, null);
        if(n != 3) this.arrayDouble.add(index, null);
        if(n != 4) this.arrayFloat.add(index, null);
        if(n != 5) this.arrayChar.add(index, null);
        if(n != 6) this.arrayBoolean.add(index, null);
        if(n != 7) this.arrayByte.add(index, null);
        if(n != 8) this.arrayString.add(index, null);
    }
    
    /** 
     * remove a cell in every array
     */
    private void removeCell(int index) {
        if(n != 0) this.arrayInt.remove(index);
        if(n != 1) this.arrayLong.remove(index);
        if(n != 2) this.arrayShort.remove(index);
        if(n != 3) this.arrayDouble.remove(index);
        if(n != 4) this.arrayFloat.remove(index);
        if(n != 5) this.arrayChar.remove(index);
        if(n != 6) this.arrayBoolean.remove(index);
        if(n != 7) this.arrayByte.remove(index);
        if(n != 8) this.arrayString.remove(index);
    }
    
    /** 
     * Set a blank cell in every array
     */
    private void setBlankCell(int index) {
        if(n != 0) this.arrayInt.set(index, null);
        if(n != 1) this.arrayLong.set(index, null);
        if(n != 2) this.arrayShort.set(index, null);
        if(n != 3) this.arrayDouble.set(index, null);
        if(n != 4) this.arrayFloat.set(index, null);
        if(n != 5) this.arrayChar.set(index, null);
        if(n != 6) this.arrayBoolean.set(index, null);
        if(n != 7) this.arrayByte.set(index, null);
        if(n != 8) this.arrayString.set(index, null);
    }
    
}