#!/bin/bash

# アイテム名のリスト
items=(
    "apple_slice_moon"
    "apple_slice_rabbit"
    "aurora_berry0"
    "aurora_berry1"
    "aurora_berry2"
    "aurora_berry3"
    "bento"
    "bento_lid"
    "glass"
    "miracleless"
    "omusubi_nori"
    "omusubi_tenmusu"
    "onigiri_nori"
    "onigiri_umeboshi"
    "onirigi_shio"
    "sandwich"
    "sandwich_berry"
    "shrimp_tempura"
    "voltagress_ore"
)

for item in "${items[@]}"; do
  template="common/src/main/resources/assets/tuyumod/models/item/shortcake.json"
  outputFile="common/src/main/resources/assets/tuyumod/models/item/${item}.json"
  
  # ファイルが存在しない場合にのみ処理を実行
  if [ ! -f "$outputFile" ]; then
    # sedコマンドを使用してテンプレートの内容を置き換え、新しいファイルに出力
    sed "s>shortcake>${item}>g" "$template" > "$outputFile"
  else
    echo "${item}.json は既に存在しています。"
  fi
done
