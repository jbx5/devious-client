import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("oq")
public class class383 {
   @ObfuscatedName("at")
   static char[] field4391 = new char[64];
   @ObfuscatedName("an")
   static char[] field4392;
   @ObfuscatedName("av")
   static char[] field4393;
   @ObfuscatedName("as")
   static int[] field4394;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field4391[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4391[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4391[var0] = (char)(var0 + 48 - 52);
      }

      field4391[62] = '+';
      field4391[63] = '/';
      field4392 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4392[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4392[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4392[var0] = (char)(var0 + 48 - 52);
      }

      field4392[62] = '*';
      field4392[63] = '-';
      field4393 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4393[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4393[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4393[var0] = (char)(var0 + 48 - 52);
      }

      field4393[62] = '-';
      field4393[63] = '_';
      field4394 = new int[128];

      for(var0 = 0; var0 < field4394.length; ++var0) {
         field4394[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field4394[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field4394[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field4394[var0] = var0 - 48 + 52;
      }

      int[] var2 = field4394;
      field4394[43] = 62;
      var2[42] = 62;
      int[] var1 = field4394;
      field4394[47] = 63;
      var1[45] = 63;
   }
}
