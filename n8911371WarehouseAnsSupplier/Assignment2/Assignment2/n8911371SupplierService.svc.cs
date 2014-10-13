using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Data.SqlClient;

namespace Assignment2
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "n8911371SupplierService" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select n8911371SupplierService.svc or n8911371SupplierService.svc.cs at the Solution Explorer and start debugging.
    public class n8911371SupplierService : In8911371SupplierService
    {

        public bool IsExistComponentNo(string componentNo)
        {
            bool isExist = false;// the record of componentNo is exist or not. 
            bool isUsefulComponentNo = CheckComponentNoRule(componentNo);// check the componentNo rule

            if (isUsefulComponentNo)
            {
                // because the field name is ComponentNo which is the same name from method para, componentNo, 
                // I use capitalization for the 1st word to distinguish
                String ComponentNo = "";

                SqlConnection connection = GetSQLConnection();
                String sql = "SELECT ComponentNo FROM Supplier where ComponentNo='" + componentNo + "'";
                SqlCommand command = GetSqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                if (reader.Read())
                {
                    ComponentNo = reader.GetString(0);
                }

                Close(reader, connection);
                //System.Console.WriteLine("ComponentNo :" + ComponentNo);

                // only componentNo has string, this means componentNo is exist so the flag should be set to true;
                if (!ComponentNo.Equals(""))
                {
                    isExist = true;
                }

                //System.Console.WriteLine("isExist :" + isExist);
                //System.Console.ReadLine();
            }   

            return isExist;
        }

        public string GetComponentName(string componentNo)
        {
            String componentName = "";
            bool isUsefulComponentNo = CheckComponentNoRule(componentNo);// check the componentNo rule

            if (isUsefulComponentNo)
            {
                SqlConnection connection = GetSQLConnection();

                String sql = "SELECT ComponentName FROM Supplier where ComponentNo='" + componentNo + "'";

                SqlCommand command = GetSqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                if (reader.Read())
                {
                    componentName = reader.GetString(0);
                }

                Close(reader, connection);
                //System.Console.WriteLine("ComponentName :" + componentName);
                //System.Console.ReadLine();
            }
            
            return componentName;
        }

        public int GetCost(string componentNo)
        {
            int cost = 0;
            bool isUsefulComponentNo = CheckComponentNoRule(componentNo);// check the componentNo rule

            if (isUsefulComponentNo)
            {
                SqlConnection connection = GetSQLConnection();

                String sql = "SELECT Cost FROM Supplier where ComponentNo='" + componentNo + "'";

                SqlCommand command = GetSqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                if (reader.Read())
                {
                    cost = reader.GetInt32(0);
                }

                Close(reader, connection);
                //System.Console.WriteLine("cost :" + cost);
                //System.Console.ReadLine();
            }
            
            return cost;
        }

        public int GetAmount(string componentNo)
        {
            int amount = 0;
            bool isUsefulComponentNo = CheckComponentNoRule(componentNo);// check the componentNo rule

            if (isUsefulComponentNo)
            {
                SqlConnection connection = GetSQLConnection();

                String sql = "SELECT Amount FROM Supplier where ComponentNo='" + componentNo + "'";

                SqlCommand command = GetSqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                if (reader.Read())
                {
                    amount = reader.GetInt32(0);
                }

                Close(reader, connection);
                //System.Console.WriteLine("amount :" + amount);
                //System.Console.ReadLine();
            }
            
            return amount;
        }

        public bool CheckAmount(string componentNo, int exceptOrderAmount)
        {
            bool isEnoughAmount = false;// check the amount state
            int currentAmount = 0;
            bool isUsefulComponentNo = CheckComponentNoRule(componentNo);// check the componentNo rule

            //  only exceptUsedAmount > 0 and isUsefulComponentNo are true. It can start to process
            if (isUsefulComponentNo && exceptOrderAmount > 0)
            {
                SqlConnection connection = GetSQLConnection();

                String sql = "SELECT Amount FROM Supplier where ComponentNo='" + componentNo + "'";

                SqlCommand command = GetSqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                if (reader.Read())
                {
                    currentAmount = reader.GetInt32(0);
                }

                Close(reader, connection);
                //System.Console.WriteLine("current amount :" + currentAmount);
                //System.Console.WriteLine("current exceptOrderAmount :" + exceptOrderAmount);

                if (currentAmount >= exceptOrderAmount)
                {
                    isEnoughAmount = true;
                }

                //System.Console.WriteLine("isEnoughAmount :" + isEnoughAmount);
                //System.Console.ReadLine();

            }
            
            return isEnoughAmount;
        }

        public bool OrderAmount(string componentNo, int orderAmount)
        {
            bool isUpdateSuccessful = false;// check update state
            int newAmount = 0;

            // 1. check CheckAmount only amount is enough to update
            isUpdateSuccessful = CheckAmount(componentNo, orderAmount);

            // amount is enough 
            if (isUpdateSuccessful)
            {
                // GetAmount(componentNo) can get current amount value
                newAmount = GetAmount(componentNo) - orderAmount;

                SqlConnection connection = GetSQLConnection();

                String sql = "UPDATE Supplier SET Amount = " + newAmount + " where ComponentNo='" + componentNo + "'";
                //System.Console.WriteLine("update SQL :" + sql);

                SqlCommand command = GetSqlCommand(sql, connection);

                SqlDataReader reader = command.ExecuteReader();

                Close(reader, connection);

                isUpdateSuccessful = true;
            }

            //System.Console.WriteLine("isUpdateSuccessful :" + isUpdateSuccessful);
            //System.Console.ReadLine();

            return isUpdateSuccessful;
        }

        private SqlConnection GetSQLConnection()
        {
            SqlConnection connection = new SqlConnection("Data Source=fastapps04.qut.edu.au;Initial Catalog=n8911371;User ID=n8911371;Password=2xixldxu");
            connection.Open();

            return connection;
        }

        private SqlCommand GetSqlCommand(String sql, SqlConnection connection)
        {
            SqlCommand command = new SqlCommand(sql, connection);

            return command;
        }

        private void Close(SqlDataReader reader, SqlConnection connection)
        {
            reader.Close();
            connection.Close();
        }

        private bool CheckComponentNoRule(string componentNo)
        {
            bool checkValue = false; // only meet the componentNo rule

            if (componentNo != null && !componentNo.Equals("") && componentNo.Length == 5)
            {
                checkValue = true;
            }

            return checkValue;
        }
    }
}
