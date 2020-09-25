package ex3;

import java.util.Arrays;

public class SortSample {
    private final int[] _data;

    public SortSample(int[] data) {
        _data = new int[data.length];
        System.arraycopy(data, 0, _data, 0, data.length);
    }

    public void sort(){
        for(int x = 0; x < _data.length -1 ; x++){
            int m = x;
            for (int y = x + 1; y < _data.length; y++){
                if(_data[m] > _data[y]){
                    m = y;
                }
            }
            // 여기서 _data[m]은 _data[x] <~> _data[_data.length -1]의 최소값이여야 한다.
            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
            // 여기서 _data[0] <~> _data[x + 1]은 이미 정렬 되어 있어야한다.
        }
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        for (int i = 0; i < _data.length; i++){
            buffer.append(_data[i]);
            buffer.append(", ");
        }
        buffer.append("]");
        return buffer.toString();
    }
}