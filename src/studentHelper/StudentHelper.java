package studentHelper;

import student.Student;

import java.sql.*;
import java.util.Scanner;

public class StudentHelper {
    public static final Scanner scanner = new Scanner(System.in);
    public static boolean didOperationPerformed =false;

    public void createNewStudentInDatabase(Connection connection, Student student) throws SQLException {
        String sql ="INSERT INTO student (rollNumber, name, year, cpi) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,student.getRollno());
        preparedStatement.setString(2,student.getName());
        preparedStatement.setInt(3,student.getYear());
        preparedStatement.setDouble(4,student.getCpi());
        didOperationPerformed =preparedStatement.executeUpdate()>=1;}
        public void isConnectionSetup()
        {
            System.out.println(didOperationPerformed?"Conncetion is setup":"Connection is not setup");

        }
        public int getrollnofromUser()
        {
            System.out.println("Enter rollno of the Student");
            return Integer.parseInt(scanner.nextLine().trim());
        }
        public String getNamefromUser()
        {
            System.out.println("Enter the name od the student");
            return scanner.nextLine().trim();
        }
        public int getYearFromUser(){
            System.out.println("Enter the year of the student");
            return Integer.parseInt(scanner.nextLine().trim());
        }
        public double getCpiFromUser()
        {
            System.out.println("Enter the CPI of the student");
            return Double.parseDouble(scanner.nextLine().trim());
        }
        private ResultSet getAllRecordoftheStudent(Connection connection) throws SQLException {
            String sqlquery = "Select * from Student";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlquery);
            return preparedStatement.executeQuery();
        }
        private void printCurrentTableData(ResultSet result) throws SQLException {
            while (result.next())
            {
                int rollnumber=result.getInt(1);
                String name = result.getString(2);
                int year= result.getInt(3);
                Double cpi =result.getDouble(4);
                Student student= new Student(name,rollnumber,year,cpi);
                System.out.println(student.toString());

            }}
            public boolean searchForstudntInDatabase(Connection connection,Student student) throws SQLException {
                return this.searchForStudentInDatabase(student.getRollno());
            }
            public boolean searchForStudentInDatabase(int studentrollnumber) throws SQLException {
                String sql = "SELECT * FROM STUDENT WHERE ROLLNUMBER=?";
                PreparedStatement preparedStatement = DatabaseConnection.connection.prepareStatement(sql);
                preparedStatement.setInt(1,studentrollnumber);
                ResultSet resultSet = preparedStatement.executeQuery();
                int counter=0;
                while (resultSet.next()){
                    counter++;
            }
                if (counter>=1){
                    System.out.println("MATCH FOUND");
                }
                return
        }

    }
