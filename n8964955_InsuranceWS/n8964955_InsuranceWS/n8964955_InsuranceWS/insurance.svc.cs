using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Data.SqlClient;

namespace Insurance {
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the class name "insurance" in code, svc and config file together.
    // NOTE: In order to launch WCF Test Client for testing this service, please select insurance.svc or insurance.svc.cs at the Solution Explorer and start debugging.
    public class insurance : Iinsurance {
        public bool IsInsured(string plateNo) {

            SqlConnection connection = new SqlConnection(
                "Data Source=fastapps04.qut.edu.au;Initial Catalog=n8964955; User ID=n8964955;" +
                "Password=9233");
            connection.Open();

            SqlCommand command = new SqlCommand(
                "SELECT plateNo FROM insuranceDB where plateNo= '" +
                plateNo + "'", connection);

            SqlDataReader reader = command.ExecuteReader();

            while (reader.Read()) {
                reader.Close();
                connection.Close();
                return true;
            }

            reader.Close();
            connection.Close();
            return false;
        }

        public int GetDiscount(string plateNo){
            
            Insur insur = new Insur();

            SqlConnection connection = new SqlConnection(
                "Data Source=fastapps04.qut.edu.au;Initial Catalog=n8964955; User ID=n8964955;" +
                "Password=9233");
            connection.Open();

            SqlCommand command = new SqlCommand(
                "SELECT discount FROM insuranceDB where plateNo= '" +
                plateNo + "'", connection);

            SqlDataReader reader = command.ExecuteReader();

            while (reader.Read()) {                
                insur.discount = reader.GetInt32(0);
            }

            reader.Close();
            connection.Close();

            return insur.discount;
        }
    }
}
