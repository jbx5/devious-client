import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class149 extends class152 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 2108480025
   )
   int field1752;
   @ObfuscatedName("e")
   byte field1751;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 1188392547
   )
   int field1753;
   @ObfuscatedName("x")
   String field1754;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Led;"
   )
   final class153 this$0;

   @ObfuscatedSignature(
      descriptor = "(Led;)V"
   )
   class149(class153 var1) {
      this.this$0 = var1;
      this.field1752 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "468341515"
   )
   void vmethod3336(Buffer var1) {
      var1.readUnsignedByte();
      this.field1752 = var1.readUnsignedShort();
      this.field1751 = var1.readByte();
      this.field1753 = var1.readUnsignedShort();
      var1.readLong();
      this.field1754 = var1.readStringCp1252NullTerminated();
      var1.readUnsignedByte();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lfn;I)V",
      garbageValue = "1227548281"
   )
   void vmethod3337(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1752);
      var2.rank = this.field1751;
      var2.world = this.field1753;
      var2.username = new Username(this.field1754);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Llq;",
      garbageValue = "-1628551002"
   )
   @Export("PlayerType_values")
   public static PlayerType[] PlayerType_values() {
      return new PlayerType[]{PlayerType.PlayerType_hardcoreIronman, PlayerType.field4155, PlayerType.PlayerType_ironman, PlayerType.field4149, PlayerType.field4161, PlayerType.PlayerType_jagexModerator, PlayerType.field4157, PlayerType.field4156, PlayerType.PlayerType_normal, PlayerType.field4153, PlayerType.field4145, PlayerType.field4154, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field4158, PlayerType.field4159, PlayerType.field4160};
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(II)Lgv;",
      garbageValue = "-640568434"
   )
   @Export("getParamDefinition")
   public static ParamComposition getParamDefinition(int var0) {
      ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
         var1 = new ParamComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "2"
   )
   public static void method3257() {
      SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
      SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
   }
}
