import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mr")
public class class363 {
   @ObfuscatedName("f")
   public static char[] field4363 = new char[64];
   @ObfuscatedName("w")
   static char[] field4364;
   @ObfuscatedName("v")
   static char[] field4367;
   @ObfuscatedName("s")
   static int[] field4362;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field4363[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4363[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4363[var0] = (char)(var0 + 48 - 52);
      }

      field4363[62] = '+';
      field4363[63] = '/';
      field4364 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4364[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4364[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4364[var0] = (char)(var0 + 48 - 52);
      }

      field4364[62] = '*';
      field4364[63] = '-';
      field4367 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4367[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4367[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4367[var0] = (char)(var0 + 48 - 52);
      }

      field4367[62] = '-';
      field4367[63] = '_';
      field4362 = new int[128];

      for(var0 = 0; var0 < field4362.length; ++var0) {
         field4362[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field4362[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field4362[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field4362[var0] = var0 - 48 + 52;
      }

      int[] var2 = field4362;
      field4362[43] = 62;
      var2[42] = 62;
      int[] var1 = field4362;
      field4362[47] = 63;
      var1[45] = 63;
   }
}
