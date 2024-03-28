module.exports = {
  branches: ['main'], // Branch monitorada
  plugins: [
    '@semantic-release/commit-analyzer',
    '@semantic-release/release-notes-generator',
    '@semantic-release/changelog',
    [
      '@semantic-release/npm',
      {
        npmPublish: true,
        pkgRoot: './dist',
        tarballDir: './dist',
        // Aqui você adiciona o token do npm como variável de ambiente
        npmToken: process.env.NPM_TOKEN,
      },
    ],
    '@semantic-release/git',
  ],
};
