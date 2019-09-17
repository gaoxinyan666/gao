class Single{
   private static Single INSTAANCE=new Single( );
   private Single( ) { }
   public static Single getInstance( ){
       return INSTANCE;
   }
}