public class BusqConcesionario {
    public static class Busqueda<T extends Comparable<T>> {
        public void OrdSeleccion(T[] data){
            int min;
            T temp;

            for (int index=0; index<data.length-1; index++){
                min=index;
                for (int scan=index+1; scan<data.length;scan++){
                    if (data[scan].compareTo(data[min])<0){
                        min=scan;
                    }
                }
                temp=data[min];
                data[min]=data[index];
                data[index]=temp;
            }
        }
        public boolean BusqLineal(T[] data, int min, int max, T target) {
            int index=min;
            boolean found=false;

            while (index<=max && !found) {
                if (data[index].compareTo(target)==0) {
                    //-1 -> inferior, 0 -> igual, 1 -> mayor
                    found=true;
                }
                index++;
            }
            return found;
        }
        public boolean BusqBinaria(T[] data, int min, int max, T target){
            boolean found=false;
            int midpoint=(min+max)/2;

            if (data [midpoint].compareTo(target)==0){
                found=true;
            }else if (data [midpoint].compareTo(target)>0){
                if(min<midpoint-1){
                    found= BusqBinaria(data,min,midpoint-1,target);
                }
            } else if (midpoint+1<=max) {
                found= BusqBinaria(data,midpoint+1,max,target);
            }
            return found;
        }
    }
}
