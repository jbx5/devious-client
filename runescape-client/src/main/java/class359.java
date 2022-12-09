import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("mp")
public class class359 {
   @ObfuscatedName("h")
   static char[] field4350 = new char[64];
   @ObfuscatedName("e")
   static char[] field4353;
   @ObfuscatedName("v")
   static char[] field4352;
   @ObfuscatedName("x")
   static int[] field4351;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field4350[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4350[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4350[var0] = (char)(var0 + 48 - 52);
      }

      field4350[62] = '+';
      field4350[63] = '/';
      field4353 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4353[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4353[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4353[var0] = (char)(var0 + 48 - 52);
      }

      field4353[62] = '*';
      field4353[63] = '-';
      field4352 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4352[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4352[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4352[var0] = (char)(var0 + 48 - 52);
      }

      field4352[62] = '-';
      field4352[63] = '_';
      field4351 = new int[128];

      for(var0 = 0; var0 < field4351.length; ++var0) {
         field4351[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field4351[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field4351[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field4351[var0] = var0 - 48 + 52;
      }

      int[] var2 = field4351;
      field4351[43] = 62;
      var2[42] = 62;
      int[] var1 = field4351;
      field4351[47] = 63;
      var1[45] = 63;
   }
}
