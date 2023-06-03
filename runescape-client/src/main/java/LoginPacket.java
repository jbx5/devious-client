import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("LoginPacket")
public class LoginPacket implements class292 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   public static final LoginPacket field3342 = new LoginPacket(14, 0);
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   static final LoginPacket field3346 = new LoginPacket(15, 4);
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   public static final LoginPacket field3343 = new LoginPacket(16, -2);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   public static final LoginPacket field3344 = new LoginPacket(18, -2);
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   public static final LoginPacket field3345 = new LoginPacket(19, -2);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   static final LoginPacket field3347 = new LoginPacket(27, 0);
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "[Llp;"
   )
   @Export("LoginPacket_indexedValues")
   static final LoginPacket[] LoginPacket_indexedValues = new LoginPacket[32];
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1205624651
   )
   @Export("id")
   public final int id;

   static {
      LoginPacket[] var0 = Decimator.method1086();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         LoginPacket_indexedValues[var0[var1].id] = var0[var1];
      }

   }

   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "0"
   )
   LoginPacket(int var1, int var2) {
      this.id = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(ILnq;Ljava/lang/String;Ljava/lang/String;IZI)V",
      garbageValue = "1686859753"
   )
   public static void method5679(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
      if (var1.isValidFileName(var2, var3)) {
         int var6 = var1.getGroupId(var2);
         int var7 = var1.getFileId(var6, var3);
         class304.musicPlayerStatus = 1;
         UserComparator9.musicTrackArchive = var1;
         VarbitComposition.musicTrackGroupId = var6;
         class304.musicTrackFileId = var7;
         class304.musicTrackVolume = var4;
         class132.musicTrackBoolean = var5;
         class157.pcmSampleLength = var0;
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1885482155"
   )
   static int method5680(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
      }
   }
}
