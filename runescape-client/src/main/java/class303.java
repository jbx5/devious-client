import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class303 {
   @ObfuscatedName("h")
   @Export("cacheDir")
   public static File cacheDir;

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)[Llu;",
      garbageValue = "-402309580"
   )
   @Export("PlayerType_values")
   public static PlayerType[] PlayerType_values() {
      return new PlayerType[]{PlayerType.field4109, PlayerType.field4106, PlayerType.field4108, PlayerType.field4107, PlayerType.field4102, PlayerType.field4094, PlayerType.field4110, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field4101, PlayerType.PlayerType_ironman, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4104, PlayerType.field4103, PlayerType.PlayerType_jagexModerator, PlayerType.field4105, PlayerType.PlayerType_normal};
   }
}
