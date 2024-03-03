package project;

class Student {

	private int id;
	private String first_name;
	private String last_name;
	private String course;
	private double fee;
	private double paid;
	private double due;
	private String address;
	private String city;
	private String state;
	private String country;
	private long phone_no;

	public Student(int id, String first_name, String last_name, String course, double fee, double paid, double due,
			String address, String city, String state, String country, long phone_no) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone_no = phone_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getPaid() {
		return paid;
	}

	public void setPaid(double paid) {
		this.paid = paid;
	}

	public double getDue() {
		return due;
	}

	public void setDue(double due) {
		this.due = due;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", course=" + course
				+ ", fee=" + fee + ", paid=" + paid + ", due=" + due + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", phone_no=" + phone_no + "]";
	}

}
