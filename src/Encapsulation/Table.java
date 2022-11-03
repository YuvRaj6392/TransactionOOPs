package Encapsulation;

public class Table {
    public static class Row {
        private int rowNumber;
        private int data;
        Row(int rowNumber, int data)
        {
            this.rowNumber=rowNumber;
            this.data=data;

        }

        public int getRowNumber() {
            return rowNumber;
        }

        public void setRowNumber(int rowNumber) {
            this.rowNumber = rowNumber;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
