public class values {

    public  double h;
    public double j;
    public double p;

    public values(double h , double j) {
        this.h = h;
        this.j = j;
	this.p = p;
    }

   public double getH()
   {

	return this.h;
   }


   public double getJ()
   {
	return this.j;

   }

   public double getP()
   {
	return this.p;

   }



    public void updateHJ(double weight,int S)
    {
	this.h += weight;
	this.j = this.h/S;	

	}

	public void updateH(double weight)
    {
        this.h += weight;

        }



    public void updateP(double p){

	this.p = p;
   }




}
