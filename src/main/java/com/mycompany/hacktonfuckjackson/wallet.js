const fs = require('fs');
const { Keypair } = require('@solana/web3.js');

// Generate Solana wallet
const keypair = Keypair.generate();

// Store keys in a JSON file
const keys = {
    publicKey: keypair.publicKey.toBase58(),
    privateKey: keypair.secretKey.toString(),
};

fs.writeFileSync('walletKeys.txt', JSON.stringify(keys));
