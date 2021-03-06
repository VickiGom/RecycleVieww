package modelo;
import android.provider.BaseColumns;

public class DefineTabla {
    public DefineTabla() {
    }
    public static abstract class Alumnos implements BaseColumns {
        public static final String TABLE_NAME ="alumnos";
        public static final String COLUMN_NAME_ID ="id";
        public static final String COLUMN_NAME_MATRICULA = "matricula";
        public static final String COLUMN_NAME_NOMBRE = "nombre";
        public static final String COLUMN_NAME_CARRERA = "carrera";
        public static final String COLUMN_NAME_FOTO = "foto";
        public static String[] REGISTRO = new String[]{
                Alumnos.COLUMN_NAME_ID,
                Alumnos.COLUMN_NAME_MATRICULA,
                Alumnos.COLUMN_NAME_NOMBRE,
                Alumnos.COLUMN_NAME_CARRERA,
                Alumnos.COLUMN_NAME_FOTO
        };
    }
}
