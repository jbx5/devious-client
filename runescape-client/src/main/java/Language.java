import java.io.IOException;
import java.util.Locale;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("Language")
public class Language implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   @Export("Language_EN")
   public static final Language Language_EN;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   @Export("Language_DE")
   static final Language Language_DE;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   @Export("Language_FR")
   public static final Language Language_FR;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   @Export("Language_PT")
   static final Language Language_PT;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   @Export("Language_NL")
   static final Language Language_NL;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   @Export("Language_ES")
   public static final Language Language_ES;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   @Export("Language_ES_MX")
   static final Language Language_ES_MX;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "[Lnx;"
   )
   @Export("Language_valuesOrdered")
   static final Language[] Language_valuesOrdered;
   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "Lon;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;
   @ObfuscatedName("ot")
   @ObfuscatedSignature(
      descriptor = "Lcb;"
   )
   @Export("tempMenuAction")
   static MenuAction tempMenuAction;
   @ObfuscatedName("al")
   final String field4329;
   @ObfuscatedName("at")
   @Export("language")
   final String language;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1624506429
   )
   @Export("id")
   final int id;

   static {
      Language_EN = new Language("EN", "en", "English", ModeWhere.field4351, 0, "GB");
      Language_DE = new Language("DE", "de", "German", ModeWhere.field4351, 1, "DE");
      Language_FR = new Language("FR", "fr", "French", ModeWhere.field4351, 2, "FR");
      Language_PT = new Language("PT", "pt", "Portuguese", ModeWhere.field4351, 3, "BR");
      Language_NL = new Language("NL", "nl", "Dutch", ModeWhere.field4343, 4, "NL");
      Language_ES = new Language("ES", "es", "Spanish", ModeWhere.field4343, 5, "ES");
      Language_ES_MX = new Language("ES_MX", "es-mx", "Spanish (Latin American)", ModeWhere.field4351, 6, "MX");
      Language[] var0 = method6938();
      Language_valuesOrdered = new Language[var0.length];
      Language[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         Language var3 = var1[var2];
         if (Language_valuesOrdered[var3.id] != null) {
            throw new IllegalStateException();
         }

         Language_valuesOrdered[var3.id] = var3;
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lne;ILjava/lang/String;)V"
   )
   Language(String var1, String var2, String var3, ModeWhere var4, int var5, String var6) {
      this.field4329 = var1;
      this.language = var2;
      this.id = var5;
      if (var6 != null) {
         new Locale(var2.substring(0, 2), var6);
      } else {
         new Locale(var2.substring(0, 2));
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "80"
   )
   @Export("getLanguage")
   String getLanguage() {
      return this.language;
   }

   public String toString() {
      return this.getLanguage().toLowerCase(Locale.ENGLISH);
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)[Lnx;",
      garbageValue = "-121"
   )
   static Language[] method6938() {
      return new Language[]{Language_FR, Language_NL, Language_DE, Language_ES_MX, Language_PT, Language_EN, Language_ES};
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)[Lmb;",
      garbageValue = "-10"
   )
   public static class337[] method6942() {
      return new class337[]{class337.field4162, class337.field4163, class337.field4164, class337.field4161};
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)Lnx;",
      garbageValue = "-1"
   )
   public static Language method6921(int var0) {
      return var0 >= 0 && var0 < Language_valuesOrdered.length ? Language_valuesOrdered[var0] : null;
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(Lsh;B)Ljava/lang/Object;",
      garbageValue = "90"
   )
   static Object method6940(class478 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field4949) {
            case 1:
               return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            case 2:
               return Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-257332846"
   )
   static final void method6931(boolean var0) {
      class323.playPcmPlayers();
      ++Client.packetWriter.pendingWrites;
      if (Client.packetWriter.pendingWrites >= 50 || var0) {
         Client.packetWriter.pendingWrites = 0;
         if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
            PacketBufferNode var1 = class330.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var1);

            try {
               Client.packetWriter.flush();
            } catch (IOException var3) {
               Client.hadNetworkError = true;
            }
         }

      }
   }
}
