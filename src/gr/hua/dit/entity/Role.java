package gr.hua.dit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY )
		@Column(name = "id")
		private int id;
		
		@Column(name = "role_name")
		private String role_name;
		
		@Column(name = "priv1")
		private String priv1;
		
		@Column(name = "priv2")
		private String priv2;
		
		@Column(name = "priv3")
		private String priv3;
		
		@Column(name = "priv4")
		private String priv4;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getRole_name() {
			return role_name;
		}

		public void setRole_name(String roleName) {
			this.role_name = roleName;
		}

		public String getPriv1() {
			return priv1;
		}

		public void setPriv1(String priv1) {
			this.priv1 = priv1;
		}

		public String getPriv2() {
			return priv2;
		}

		public void setPriv2(String priv2) {
			this.priv2 = priv2;
		}

		public String getPriv3() {
			return priv3;
		}

		public void setPriv3(String priv3) {
			this.priv3 = priv3;
		}

		public String getPriv4() {
			return priv4;
		}

		public void setPriv4(String priv4) {
			this.priv4 = priv4;
		}

	
}
