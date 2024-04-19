module.exports = {
  branches: ['main'],
  plugins: [
    '@semantic-release/commit-analyzer',
    '@semantic-release/release-notes-generator',
    '@semantic-release/changelog',
    [
      '@semantic-release/npm',
      {
        npmPublish: true,
        pkgRoot: './', 
        tarballDir: './', 
        npmToken: process.env.NPM_TOKEN,
      },
    ],
    '@semantic-release/git',
  ],
};